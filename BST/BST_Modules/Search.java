package BST_Modules;
public class Search {

    public boolean search (Node root, int key){
        if (root == null) return false;
        if (key == root.key) return true;
        else if (key < root.key) return search(root.left, key);
        else return search(root.right, key);
    }

    public Node minNode(Node root){
        if (root == null) return null;
        Node cur = root;
        while (root.left != null) cur = cur.left;
        return cur;
    }
    
    public Node maxNode(Node root){
        if (root == null) return null;
        Node cur = root;
        while (cur.right != null) cur = cur.right;
        return cur;
    }
}
