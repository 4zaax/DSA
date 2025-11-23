package BST_Modules;
public class Traverse {
    
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
}
