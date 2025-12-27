#include <iostream>
#include <vector>
using namespace std;
class Solution {
    struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
    };
public:
    int findTheWinner(int n, int k) {
        ListNode* head = new ListNode(1);
        ListNode* prev = head;
        for (int i = 2; i <= n; i++){
            ListNode* newNode = new ListNode(i);
            newNode -> next = nullptr;
            if (prev){
                prev->next = newNode;
            }
            prev = newNode;
        }
        prev->next = head;
        ListNode* current = head;
        if (k == 1){
            return prev->val;
        }
        while(current->next != current){
            int i = 0;
            for (i = 0; i < k-1; i++){
                if (i == k-2){
                    current = current->next;
                    prev = prev->next;
                    prev->next = current->next;
                    current = current->next;
                    continue;
                }
                prev = current;
                current = current->next;
            }
        }
        return current->val;
    }
};

int main(){
    Solution sol;
    int res = sol.findTheWinner(3,1);
    cout << "result was " << res;
}