class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}



public class implement {
    public static void traverse_sll(Node head){

    while (head != null){
        System.out.print(head.data+" ");
        head=head.next;
    }
    System.out.print("\n");
    
    }

    public static Node insert_begin_sll(Node head, int key){
        Node newFirst = new Node(50);
        newFirst.next = head;
        return newFirst;
    }

    public static Node insert_end_sll(Node head, int key){
        Node first = head;
        Node newLast = new Node(key);
        while (first.next != null) first = first.next;
        first.next = newLast;
        return head;
}

public static Node insert_by_pos(Node head, int val, int pos){
    if (pos < 1)
        return head;

    // head will change if pos=1
    if (pos == 1) {
        Node newNode = new Node(val);
        newNode.next = head;
        return newNode;
    }

    Node curr = head;
    for (int i = 1; i < pos - 1 && curr != null; i++) {
        curr = curr.next;
    }
    if (curr == null)
        return head;
    Node newNode = new Node(val);

    newNode.next = curr.next;
    curr.next = newNode;
    return head;
}
    public static Node del_begin(Node head){
        if (head == null) return null;
        return head.next;
    }    
    
    public static Node del_end(Node head){
        if (head == null) return null;
        Node current = head;
        Node prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        prev.next = null;
        return head;
    }

    public static Node del_pos_dll(Node head, int pos){
    if (pos <= 1) {
        Node newHead = head.next;
        head.next = null;
        return newHead;
    }
    Node current = head;
    for (int i = 1; (i < pos-1) && (current.next.next != null); i++){
        current = current.next;
    }
    Node freeLater = current.next;
    current.next = current.next.next;
    freeLater.next = null;
    return head;
}

}