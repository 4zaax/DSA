public class Main {
        public static void main(String[] args){
        SLL sll = new SLL(1,2,3,4,5);
        System.out.println(sll.toString());
        System.out.println(sll.size());
        sll.deleteFirst();
        System.out.println(sll.toString());
        sll.insertFirst(100);
        System.out.println(sll.toString());
        sll.deleteLast();
        System.out.println(sll.toString());
        sll.insert(1012);
        System.out.println(sll.toString());
    }
}
