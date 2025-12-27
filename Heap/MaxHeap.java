import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MaxHeap {
    public ArrayList<Integer> h;

    MaxHeap(){
        h = new ArrayList<>();
    }    
    
    MaxHeap(int key){
        h = new ArrayList<>();
        System.out.printf("i initialized a new heap with value %d", h.get(0));
    }

    private void swap(int i, int j){
        i = i - 1;
        j = j - 1;
        int ival = this.h.get(i);
        int jval = this.h.get(j);
        h.set(i, jval);
        h.set(j, ival);
    }

    public boolean upHeapify(int index){
        System.out.println(index);
        int parentIndex = index/2;
        System.out.println(parentIndex);
        if (this.h.get(parentIndex)<=this.h.get(index)){
            swap(index,parentIndex);
            return true;
        }
        return false;
    }

    public void insert(int key){
        h.add(key);
        int cur = h.size();
        while (upHeapify(cur) == true){
            cur /= 2;
        }
    }

    public void print() {
        for (int i =0; i < this.h.size(); i++){
            System.out.println(this.h.get(i));
        }
    }
}