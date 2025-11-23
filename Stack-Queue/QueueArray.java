public class QueueArray {
    private int[] arr;
    private int front;
    private int rear;
    private int size;

    QueueArray(int capacity){
        if (capacity <= 0) capacity = 1;
        this.arr = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    QueueArray(int... vals){
        int cap = Math.max(1, vals.length);
        this.arr = new int[cap];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        for (int v : vals) enqueue(v);
    }

    public void front() {
        if (size == 0) {
            System.out.println("empty");
            return;
        }
        System.out.println(arr[front]);
    }

    public void back() {
        if (size == 0) {
            System.out.println("empty");
            return;
        }
        System.out.println(arr[rear]);
    }

    public void enqueue(int val){
        if (size == arr.length) {
            grow();
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = val;
        size++;
    }

    public void dequeue(){
        if (size == 0) return;
        front = (front + 1) % arr.length;
        size--;
        if (size == 0) {
            front = 0;
            rear = -1;
        }
    }

    public void show(){
        if (size == 0) {
            System.out.println("[]");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % arr.length;
            sb.append(arr[idx]);
            if (i != size - 1) sb.append(", ");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    private void grow(){
        int newCap = arr.length * 2;
        int[] newArr = new int[newCap];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[(front + i) % arr.length];
        }
        arr = newArr;
        front = 0;
        rear = size - 1;
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray(2, 3, 4, 5);
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
