public class BST {

    Node root;

    BST () {
        this.root = null;
    }
    BST(int key){
        root = new Node(key);
    }

    //** Search **//

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


    //** Successor, Predecessor **//

     public Node successor(Node node) {

        if (node.right != null) return minNode(node.right);
        
        // Otherwise, go up until we find a node that is the left child of its parent
        Node succ = null;
        Node cur = this.root;
        while (cur != null) {
            if (node.key < cur.key) {
                succ = cur; // potential successor
                cur = cur.left;
            } else if (node.key > cur.key) {
                cur = cur.right;
            } else {
                break; // Found the node
            }
        }
        return succ;
    }

    public Node predecessor(Node node) {

        if (node.left != null) return maxNode(node.left);

        // Otherwise, go up until we find a node that is the right child of its parent
        Node pred = null;
        Node cur = this.root;
        while (cur != null) {
            if (node.key < cur.key) {
                cur = cur.left;
            } else if (node.key > cur.key) {
                pred = cur; 
                cur = cur.right;
            } else {
                break; 
            }
        }
        return pred;
    }

    //** Insertion **//

    public void insert(int key){
        insert(root,key);
    }

    public void insert(Node root, int key){
        if (root == null){
            root = new Node(key);
            return;
        }
        if (key < root.key){
            if (root.left == null){
                root.left = new Node(key);
                return;
            } else {
                insert(root.left, key);
                return;
            }
        }else if (key > root.key){
            if (root.right == null){
                root.right = new Node(key);
                return;
            } else {
                insert (root.right,key);
                return;
            }
        }
        return;
    }

    
    //* Traversing Methods */ 

    public void inorder (){
        inorder(this.root);
    }
    
    public void preorder (){
        preorder(this.root);
    }

    public void postorder (){
        postorder(this.root);
    }
    
    public void inorder (Node root){
        if (root == null) return;
        inorder(root.left);
        System.out.printf("%d ",root.key);
        inorder(root.right);
        return;
    }

    public void preorder(Node root){
        if (root == null) return;
        System.out.printf("%d ",root.key);
        preorder(root.left);
        preorder(root.right);
        return;
    }

    public void postorder (Node root){
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.printf("%d ",root.key);
    }

    //** Finding Height and Depth **//

    public int height (){
        return height(this.root);
    }

    public int height(Node root){
        if (root == null) return 0;
        if (root.right == null && root.left == null) return 0;
        int l_height = height(root.left);
        int r_height = height(root.right);
        if (l_height >= r_height){
            return l_height+1;
        } else {
            return r_height+1;
        }
    }

    public int depth(){
        return depth(this.root);
    }

    public int depth(Node root){
        if (root == null) return -1;
        Node cur = this.root;
        int res = 0;
        while (cur != root){
            if (root.key <= cur.key){
                res++;
                cur = cur.left;
            } else if (root.key > cur.key){
                res++;
                cur = cur.right;
            }
        }
        return res;
    }

    //** Deleting Node **//

        public Node delete(int key){
            return delete(this.root, key);
        }

        public Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.key) {
            root.left = delete(root.left, key);
        } else if (key > root.key) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left; 
            }
            root.key = minNode(root.right).key;
            root.right = delete(root.right, root.key);
        }
        return root;
    }
}