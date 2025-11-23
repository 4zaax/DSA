public class Main {
    public static void main(String[] args){
        BST bb = new BST(8);
        bb.insert(3);
        bb.insert(10);
        bb.insert(1);
        bb.insert(6);
        bb.insert(4);
        bb.insert(7);
        bb.insert(14);
        bb.insert(13);
        bb.delete(3);
        bb.preorder();
        System.out.println("");
        bb.delete(8);
        bb.preorder();
    }
}
