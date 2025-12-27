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
    ListNode* deleteDuplicates(ListNode* head) {
        if (!head) return nullptr;
        ListNode* prev = head;
        ListNode* current = head;
        while(current){
            if (current->val == prev->val){
                current = current->next;
                if(!current) {prev->next = nullptr;return head;}
            } else {
                prev->next = current;
                prev = current;
                continue;
            }
        }
        return head;
    }
};

int main(){
    ListNode* head = new ListNode(1);
    ListNode* two = new ListNode(1);
    ListNode* three = new ListNode(2);
    ListNode* four = new ListNode(2);
    ListNode* five = new ListNode(3);
    head->next = two;
    two->next = three;
    three->next = four;
    four->next = five;
    five->next = nullptr;
    Solution sol;
    ListNode* newNode = sol.deleteDuplicates(head);
    ListNode* cur = newNode;
    while(cur){
        cout << cur->val << " ";
        cur = cur->next;
    }
}