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
    ListNode* reverseList(ListNode* head) {
        if (!head || !head->next) return head;
        ListNode* prev = nullptr;
        ListNode* current = head;
        ListNode* next = head->next;
        while (current != nullptr){
            next = current->next;
            current->next = prev;
            prev = current;
            current = next;
        }
        return prev;
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
    ListNode* newNode = sol.reverseList(head);
    ListNode* cur = newNode;
    while(cur){
        cout << cur->val << " ";
        cur = cur->next;
    }
}