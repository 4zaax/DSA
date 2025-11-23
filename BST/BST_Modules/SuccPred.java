package BST_Modules;
public class SuccPred {
        //** Successor, Predecessor **//

    //  public Node successor(Node node) {

    //     if (node.right != null) return minNode(node.right);
        
    //     // Otherwise, go up until we find a node that is the left child of its parent
    //     Node succ = null;
    //     Node cur = this.root;
    //     while (cur != null) {
    //         if (node.key < cur.key) {
    //             succ = cur; // potential successor
    //             cur = cur.left;
    //         } else if (node.key > cur.key) {
    //             cur = cur.right;
    //         } else {
    //             break; // Found the node
    //         }
    //     }
    //     return succ;
    // }

    // public Node predecessor(Node node) {

    //     if (node.left != null) return maxNode(node.left);

    //     // Otherwise, go up until we find a node that is the right child of its parent
    //     Node pred = null;
    //     Node cur = this.root;
    //     while (cur != null) {
    //         if (node.key < cur.key) {
    //             cur = cur.left;
    //         } else if (node.key > cur.key) {
    //             pred = cur; 
    //             cur = cur.right;
    //         } else {
    //             break; 
    //         }
    //     }
    //     return pred;
    // }

    // private Node minNode(Node root){
    //     if (root == null) return null;
    //     Node cur = root;
    //     while (root.left != null) cur = cur.left;
    //     return cur;
    // }
    
    // private Node maxNode(Node root){
    //     if (root == null) return null;
    //     Node cur = root;
    //     while (cur.right != null) cur = cur.right;
    //     return cur;
    // }
}
