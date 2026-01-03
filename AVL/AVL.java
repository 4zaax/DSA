public class AVL {
    public class Node {
        int key;
        int height;
        Node left;
        Node right;

        Node(int key){
            this.key = key;
            this.height = 0;
            this.left = null;
            this.right = null;
        }
    }

    public Node root;

    AVL(int key){
        this.root = new Node(key);
    }

    AVL(){
        this.root = null;
    }

    public int height(){
        return height(this.root);
    }

    public int height(Node n){
        return (n == null) ? -1 : n.height;
    }

    public int getBalance(){
        return getBalance(this.root);
    }

    public int getBalance(Node n){
        if (n == null) return 0;
        return height(n.left) - height(n.right);
    }

    private void updateHeight(Node n) {
        if (n == null) return;
        n.height = 1 + Math.max(height(n.left), height(n.right));
    }

    // * Rotations * //

    public Node rightRotate(Node x){
        Node y = x.left;
        Node t2 = (y == null) ? null : y.right;

        y.right = x;
        x.left = t2;

        updateHeight(x);
        updateHeight(y);

        return y;
    }

    public Node leftRotate(Node x){
        Node y = x.right;
        Node t2 = (y == null) ? null : y.left;

        y.left = x;
        x.right = t2;

        updateHeight(x);
        updateHeight(y);

        return y;
    }

    // * find node (same as BST) * //

    public boolean search(int key){
        return search(this.root, key);
    }

    public boolean search (Node root, int key){
        if (root == null) return false;
        if (key == root.key) return true;
        else if (key < root.key) return search(root.left, key);
        else return search(root.right, key);
    }

    public Node findNode (int key){
        return findNode(this.root, key);
    }

    public Node findNode (Node root, int key){
        if (root == null) return null;
        if (key == root.key) return root;
        else if (key < root.key) return findNode(root.left, key);
        else return findNode(root.right, key);
    }

    public Node findParent(Node root){
        Node current = this.root;
        while (current != null) {
            if (current.left != null && current.left.key == root.key) {
                return current;
            }
            if (current.right != null && current.right.key == root.key) {
                return current;
            }

            if (root.key < current.key) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return null;
    }

    public Node findParentByKey(int key) {
        Node current = this.root;
        while (current != null) {
            if (current.key == key) {
                return null;
            }
            if (current.left != null && current.left.key == key) {
                return current;
            }
            if (current.right != null && current.right.key == key) {
                return current;
            }
            if (key < current.key) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return null;
    }

    public Node minNode (){
        return minNode(this.root);
    }

    public Node minNode(Node root){
        if (root == null) return null;
        Node cur = root;
        while (cur.left != null) cur = cur.left;
        return cur;
    }

    public Node maxNode(){
        return maxNode(this.root);
    }

    public Node maxNode(Node root){
        if (root == null) return null;
        Node cur = root;
        while (cur.right != null) cur = cur.right;
        return cur;
    }

    public Node successor(Node n){
        if (n == null) return null;
        if (n.right != null){
            return minNode(n.right);
        }
        Node cur = this.root;
        Node succ = null;
        while (cur != null) {
            if (n.key < cur.key) {
                succ = cur;
                cur = cur.left;
            } else if (n.key > cur.key) {
                cur = cur.right;
            } else {
                break;
            }
        }
        return succ;
    }

    public Node predecessor(Node n){
        if (n == null) return null;
        if (n.left != null){
            return maxNode(n.left);
        }
        Node cur = this.root;
        Node pred = null;
        while (cur != null){
            if (n.key > cur.key) {
                pred = cur;
                cur = cur.right;
            } else if (n.key < cur.key) {
                cur = cur.left;
            } else {
                break;
            }
        }
        return pred;
    }

    // * gpt implementation of succ and pred * //

        // Successor / Predecessor by key (convenient)
    // public Node successor(int key) { 
    //     Node cur = root;
    //     Node succ = null;
    //     while (cur != null) {
    //         if (key < cur.key) {
    //             succ = cur;
    //             cur = cur.left;
    //         } else {
    //             cur = cur.right;
    //         }
    //     }
    //     return succ;
    // }

    // public Node predecessor(int key) {
    //     Node cur = root;
    //     Node pred = null;
    //     while (cur != null) {
    //         if (key > cur.key) {
    //             pred = cur;
    //             cur = cur.right;
    //         } else {
    //             cur = cur.left;
    //         }
    //     }
    //     return pred;
    // }

    // * Traversal * //

    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(Node n) {
        if (n == null) return;
        inorder(n.left);
        System.out.print(n.key + " ");
        inorder(n.right);
    }

    public void preorder() {
        preorder(root);
        System.out.println();
    }

    private void preorder(Node n) {
        if (n == null) return;
        System.out.print(n.key + " ");
        preorder(n.left);
        preorder(n.right);
    }

    public void postorder() {
        postorder(root);
        System.out.println();
    }

    private void postorder(Node n) {
        if (n == null) return;
        postorder(n.left);
        postorder(n.right);
        System.out.print(n.key + " ");
    }

    public void insert(int key) {
        root = insert(root, key);
    }

    private Node insert(Node node, int key) {
        if (node == null) return new Node(key);
        if (key < node.key) node.left = insert(node.left, key);
        else if (key > node.key) node.right = insert(node.right, key);
        else return node;

        updateHeight(node);
        int balance = getBalance(node);

        if (balance > 1 && key < node.left.key) {
            return rightRotate(node);
        }
        if (balance < -1 && key > node.right.key) {
            return leftRotate(node);
        }
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public void delete(int key) {
        root = delete(root, key);
    }

    private Node delete(Node node, int key) {
        if (node == null) return null;

        if (key < node.key) {
            node.left = delete(node.left, key);
        } else if (key > node.key) {
            node.right = delete(node.right, key);
        } else {
            if (node.left == null || node.right == null) {
                Node temp = (node.left != null) ? node.left : node.right;
                if (temp == null) {
                    node = null;
                } else {
                    node = temp;
                }
            } else {
                Node succ = minNode(node.right);
                node.key = succ.key;
                node.right = delete(node.right, succ.key);
            }
        }

        if (node == null) return null;

        updateHeight(node);
        int balance = getBalance(node);

        if (balance > 1 && getBalance(node.left) >= 0) {
            return rightRotate(node);
        }
        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1 && getBalance(node.right) <= 0) {
            return leftRotate(node);
        }
        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }
}
