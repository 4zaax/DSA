public class MergeSLL {
    static class Node {
    int val;
    Node next;
    Node(int val) { this.val = val; }
  }

  Node merge(Node left, Node right){
    Node dummyNode = new Node(0);
    Node current = dummyNode;

    while (left != null && right != null){
        if (left.val <= right.val){
            current.next = left;
            left = left.next; 
        } else {
            current.next = right;
            right = right.next;
        }
        current = current.next;
    }
    current.next = left!=null ? left : right;
    return dummyNode.next;
  }

}
