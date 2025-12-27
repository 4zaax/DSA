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
    ListNode* rotateRight(ListNode* head, int k) {
        if (!head) return nullptr;
        ListNode* finalHead = head;
        for (int i = 0; i < k; i++){
            ListNode* tail = findTail(finalHead);
            ListNode* tailPrev = findTailPrev(finalHead);
            tail->next = finalHead;
            tailPrev->next = nullptr;
            finalHead = tail;
        }
        return finalHead;
    }

    ListNode* findTail(ListNode* head){
        ListNode* dummy = new ListNode(0);
        dummy->next = head;
        ListNode* current = dummy;
        while(current->next){
            current = current->next;
        }
        return current;
    }    
    ListNode* findTailPrev(ListNode* head){
        ListNode* dummy = new ListNode(0);
        dummy->next = head;
        if (!dummy->next->next)return head;
        ListNode* current = dummy;
        while(current->next->next){
            current = current->next;
        }
        return current;
    }
};

int main(){
    ListNode* head = new ListNode(1);
    ListNode* two = new ListNode(2);
    ListNode* three = new ListNode(3);
    ListNode* four = new ListNode(4);
    ListNode* five = new ListNode(5);
    head->next = two;
    two->next = three;
    three->next = four;
    four->next = five;
    five->next = nullptr;
    Solution sol;
    ListNode* nehad = sol.rotateRight(five,2);
    ListNode* cur = nehad;
    while(cur){
        cout << cur->val << " ";
        cur = cur->next;
    }
}