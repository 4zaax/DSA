public class SLL {
  static class Node {
    int val;
    Node next;
    Node(int val) { this.val = val; }
  }

  public Node head;

  public SLL(int... values) {
    if (values == null || values.length == 0) {
      head = null;
      return;
    }

    head = new Node(values[0]);
    Node cur = head;

    for (int i = 1; i < values.length; i++) {
      cur.next = new Node(values[i]);
      cur = cur.next;
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    Node cur = head;
    while (cur != null) {
      sb.append(cur.val);
      if (cur.next != null) sb.append(" -> ");
      cur = cur.next;
    }
    return sb.toString();
  }

  public void insert(int val){
    Node newNode = new Node(val);
    Node cur = this.head;
    if (cur == null){this.head = newNode; return;};
    while (cur.next != null){
        cur = cur.next;
    }
    cur.next = newNode;
  }

  public int size(){
    int count = 0;
    Node current = head;
    while (current != null){
      count++;
      current = current.next;
    }
    return count;
  }

  public void deleteFirst(){
    head = head.next;
  }

  public void deleteLast(){
    Node dummy = new Node(0);
    dummy.next = this.head;
    Node current = dummy;
    Node prev = dummy;
    while(current.next != null){
      prev = current;
      current = current.next;
    }
    prev.next = null;

  }

  public void insertFirst(int val){
    Node newNode = new Node(val);
    newNode.next = this.head;
    this.head = newNode;
  }

  public boolean isEmpty(){
    return head == null ? true : false;
  }
}