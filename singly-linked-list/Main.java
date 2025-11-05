class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}



public class Main {
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

    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node (30);
        head.next.next.next = new Node(40);
        insert_end_sll(head, 50);
        traverse_sll(head);
    }
}