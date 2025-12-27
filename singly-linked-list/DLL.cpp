#include <iostream>
using namespace std;

class DLL {
private:
    struct Node {
        int val;
        Node* next;
        Node* prev;
        Node(int val){
            this->val = val;
            next = nullptr;
            prev = nullptr;
        };
        Node(){
            this->val = 0;
            next = nullptr;
            prev = nullptr;
        };
    };
    Node* head = nullptr;
    Node* tail = nullptr;

public:
    DLL(initializer_list<int> vals){
        for (auto i : vals) push_back(i);
    }

    void push_back(int v) {
        Node* n = new Node(v);
        if (!head) head = tail = n;
        else { 
            tail->next = n;
            Node* prev = tail;
            tail = n;
            tail->prev = prev;
        }
    }

    void toString() {
    if (!head) { cout << "empty\n"; return; }
    for (Node* cur = head; cur; cur = cur->next)
        cout << cur->val << (cur->next ? " -> " : "\n");
    }

    void insertAfter(int n, int x){
        Node* dummy = new Node(0);
        dummy->next = head;
        Node* current = dummy;
        Node* newNode = new Node(x);
        for (int i = 0; i < n && current->next != nullptr; i++){
            current = current-> next;
        }
        if (current->next) current->next->prev = newNode;
        newNode->next = current->next;
        current->next = newNode;
        newNode->prev = current;
        this->head = dummy->next;
    }

    void deleteAfter(int n){
        Node* dummy = new Node(0);
        dummy->next = head;
        Node* current = dummy;
        for (int i = 0; i < n && current->next; i++){
            current = current->next;
        }
        if (current->next){
            current->next = current->next->next;
            current->next->prev = current;
        } else {
            current->prev->next = nullptr;
        }
        this->head = dummy->next;
    }
};

int main(){
    DLL dll {1,2,3,4,5};
    dll.toString();
    dll.insertAfter(100,20);
    dll.toString();
    dll.deleteAfter(100);
    dll.toString();
}