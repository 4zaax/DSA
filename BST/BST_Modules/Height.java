package BST_Modules;
public class Height {
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
}
