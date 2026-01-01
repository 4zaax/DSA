#include <iostream>
#include <vector>
using namespace std;

void downHeapify(vector<int>& v, int i, int n) {
    while (true) {
        int l = 2*i + 1;
        int r = 2*i + 2;
        int largest = i;

        if (l < n && v[l] > v[largest]) largest = l;
        if (r < n && v[r] > v[largest]) largest = r;

        if (largest == i) break;
        swap(v[i], v[largest]);
        i = largest;
    }
}

void buildMaxHeap(vector<int>& v) {
    int n = (int)v.size();
    for (int i = n/2 - 1; i >= 0; --i) {
        downHeapify(v, i, n);
    }
}

int main() {
    vector<int> v = {20,8,7,4,1,10,30,11,8,40,14,100};
    buildMaxHeap(v);

    for (int x : v) cout << x << "\n";
}
