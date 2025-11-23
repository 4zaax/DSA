public class StackArray {
    private int[] arr;
    private int top;

    StackArray(int capacity){
        if (capacity <= 0) capacity = 1;
        this.arr = new int[capacity];
        this.top = -1;
    }

    StackArray(int... vals){
        int cap = Math.max(1, vals.length);
        this.arr = new int[cap];
        this.top = -1;
        for (int v : vals) push(v);
    }

    public void peek(){
        if (top == -1) {
            System.out.println("empty");
            return;
        }
        System.out.println(arr[top]);
    }

    public void push(int val){
        if (top + 1 == arr.length) {
            grow();
        }
        arr[++top] = val;
    }

    public void pop(){
        if (top == -1) return;
        top--;
    }

    public void show(){
        if (top == -1) {
            System.out.println("[]");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <= top; i++) {
            sb.append(arr[i]);
            if (i != top) sb.append(", ");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    private void grow(){
        int newCap = arr.length * 2;
        int[] newArr = new int[newCap];
        for (int i = 0; i <= top; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public static void main(String[] args) {
        StackArray s = new StackArray(2, 3, 4, 5);
        s.peek();
        s.push(199);
        s.push(303);
        s.push(404);
        s.show();
        s.pop();
        s.pop();
        s.show();
        s.peek();
    }
}
