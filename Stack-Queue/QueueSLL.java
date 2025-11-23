public class QueueSLL {
    private SLL myLinkedList;
    QueueSLL(int... vals){
        this.myLinkedList = new SLL(vals);
    }
    public void front() {
        if (myLinkedList.head == null) {
            System.out.println("empty");
            return;
        }
        System.out.println(myLinkedList.head.val);
    }

    public void back() {
        if (myLinkedList.head == null) {
            System.out.println("empty");
            return;
        }

        SLL.Node cur = myLinkedList.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        System.out.println(cur.val);
    }

    public void enqueue(int val){
        myLinkedList.add(val);
    }

    public void dequeue(){
        myLinkedList.head = myLinkedList.head.next;
    }

    public void show(){
        System.out.println(myLinkedList.toString());;
    }


    public static void main(String[] args) {
        QueueSLL q = new QueueSLL(2, 3, 4, 5);
        q.front();
        q.back();
        q.enqueue(199);
        q.enqueue(303);
        q.enqueue(404);
        q.show();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.show();
  }
}