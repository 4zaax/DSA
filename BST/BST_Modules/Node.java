package BST_Modules;

public class Node{
        int key;
        Node right;
        Node left;

        Node(int key){
            this.key = key;
            this.right = null;
            this.left = null;
        }
        Node (int key, Node right, Node left){
            this.key = key;
            this.right = right;
            this.left = left;
        }
    }