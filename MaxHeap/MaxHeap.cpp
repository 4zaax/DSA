#include <iostream>
#include <vector>
#include <math.h>
using namespace std;

class MaxHeap{
    public:
    int maxVal(void){
        return heapArray[0];
    }
    int parent(int i){
        return i/2;
    }

    int leftChild(int i){
        return 2*i;
    }

    int rightChild(int i){
        return 2*i+1;
    }

    bool hasLeftChild(int i){
        if (2*i <= heapArray.size()) return true;
        return false;
    }    
    
    bool hasRightChild(int i){
        if (2*i+1 <= heapArray.size()) return true;
        return false;
    }

    int getVal(int i){
        return heapArray.at(i-1);
    }

    int getLast(void){
        return heapArray.size();
    }

    int realIndex(int index){
        return index-1;
    }

    void upHeapify(int i){
        if (i <= 1) return ;
        int currentVal = getVal(i);
        int parentVal = getVal(parent(i));
        if (parentVal < currentVal) swap(heapArray[i-1], heapArray[parent(i)-1]);
        else return;
        upHeapify(parent(i));
    }

    void downHeapify(int i){
        int treeHeight = findHeight();
        if (i >= pow(2, treeHeight)) return;
        int currentVal = getVal(i);
        if (!hasLeftChild(i)) return;
        if (!hasRightChild(i)){
            int lchVal = getVal(leftChild(i));
            if (lchVal > getVal(i)) swap(heapArray[realIndex(i)], heapArray[realIndex(leftChild(i))]);
            return;
        }
        int lchVal = getVal(leftChild(i));
        int rchVal = getVal(rightChild(i));
        int bigChild = lchVal >= rchVal ? lchVal : rchVal;
        int bigChildIndex = lchVal >= rchVal ? leftChild(i) : rightChild(i);
        if (getVal(i)>= bigChild)return;
        swap(heapArray[realIndex(i)], heapArray[realIndex(bigChildIndex)]);
        cout << "swapped " << currentVal << " with " << bigChild << endl;
        downHeapify(bigChildIndex);
    }


    void insert(int x){
        heapArray.push_back(x);
        upHeapify(heapArray.size());
    }

    int heapSize(void){
        return heapArray.size();
    }

    int findHeight(void){
        return log2(heapArray.size());
    }

    void BFS(void){
        for (auto i : heapArray){
            cout << i << " ";
        }
        cout << endl;
    }

    void increaseKey(int i, int newVal){
        int currentVal = getVal(i);
        if (newVal < currentVal) throw new exception();
        heapArray[realIndex(i)] = newVal;
        upHeapify(i);
    }

    void deleteByIndex(int i){
        swap(heapArray[realIndex(i)], heapArray[realIndex(getLast())]);
        heapArray.pop_back();

        int swappedVal = getVal(i);
        int parentVal = getVal(parent(i));
        if (parentVal < swappedVal){
            upHeapify(i);
            return;
        }
        downHeapify(i);
    }
    private:
    vector<int> heapArray;
};

int main(){
    MaxHeap h;
    h.insert(100);
    h.insert(14);
    h.insert(40);
    h.insert(8);
    h.insert(11);
    h.insert(30);
    h.insert(10);
    h.insert(1);
    h.insert(4);
    h.insert(7);
    h.insert(8);
    h.insert(20);
    cout << h.findHeight() << endl;
    h.deleteByIndex(3);
    h.BFS();
}