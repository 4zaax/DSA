#include <iostream>
using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
public:
    ListNode* sortList(ListNode* head) {
        return head;
    }
};

int nodeCount(ListNode* head){
    ListNode* cur = head;
    int count = 0;
    while (cur){
        count++;
        cur = cur->next;
    }
    return count;
}

ListNode* split(ListNode* head){
    if (!head || !head->next) return nullptr;
    int nodeCnt = nodeCount(head);
    int newCount = nodeCnt/2;
    ListNode* tail = head;
    for(int i = 1; i < newCount; i++){
        tail = tail->next;
    }
    ListNode* newHead = tail->next;
    tail->next = nullptr;
    return newHead;
}

void printSLL(ListNode* head){
    ListNode* cur = head;
    while (cur){
        cout << cur->val << " -> ";
        cur = cur->next;
    }
    cout << endl;
}

ListNode* mergeHelper(ListNode* left, ListNode* right){
    ListNode dummy(0);
    ListNode* cur = &dummy;

    while (left && right) {
        if (left->val <= right->val) {
            cur->next = left;
            left = left->next;
        } else {
            cur->next = right;
            right = right->next;
        }
        cur = cur->next;
    }
    cur->next = left ? left : right;
    return dummy.next;
}

ListNode* mergeSort_SLL(ListNode* head){
    if (!head || !head->next) return head; // good base case

    ListNode* left = head;
    ListNode* right = split(left);

    left = mergeSort_SLL(left);
    right = mergeSort_SLL(right);

    return mergeHelper(left, right);
}

int main(){
    ListNode* head = new ListNode(5);
    head->next = new ListNode(-1);
    head->next->next = new ListNode(3);
    head->next->next->next = new ListNode(2);

    printSLL(head);
    head = mergeSort_SLL(head);
    printSLL(head);
}