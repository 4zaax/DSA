#include <iostream>
#include <stack>
class Node {
public:
    int data;
    Node* next;
    Node(int data){
        this-> data = data;
        this->next = nullptr;
    }
};

/*Normal Traversing Singly Linked List*/
    //Time Complexity: O(n)
    //Auxiliary Space: O(1)
void traverse_sll(Node* head){
    std::cout << "traverse_sll function:" << std::endl;
    while (head != nullptr){
        std::cout << head->data << "\n";
        head = head->next;
    }
    std::cout << std::endl;
}

/*Recursively Traversing Singly Linked List*/
    //Time Complexity: O(n)
    //Auxiliary Space: O(n) because of recursive stack space.
void recursive_traverse_sll(Node* head){
    std::cout << "recursive_traversal_sll function:" << std::endl;
    if (head == nullptr) return;
    std::cout << head->data << std::endl;
    recursive_traverse_sll(head->next);
}

/*------- Different Insertion Methods -----*/

//Time Complexity: O(1)
//Auxiliary Space: O(1) 
Node* insert_begin_sll(Node* first, int key){
    Node* new_first = new Node(key);
    new_first->next = first;
    return new_first;
}

//Time Complexity: O(n)
//Auxiliary Space: O(1) 
Node* insert_end_sll(Node* head, int key){
    Node* first = head;
    Node* newLast = new Node(key);
    while (first->next != nullptr) first = first->next;
    first->next = newLast;
    return head;
}

//Time Complexity: O(n)
//Auxiliary Space: O(1) 
Node* insert_by_pos(Node* head, int val, int pos){
    if (pos < 1)
        return head;

    // head will change if pos=1
    if (pos == 1) {
        Node *newNode = new Node(val);
        newNode->next = head;
        return newNode;
    }

    Node *curr = head;
    for (int i = 1; i < pos - 1 && curr != nullptr; i++) {
        curr = curr->next;
    }
    if (curr == nullptr)
        return head;
    Node *newNode = new Node(val);

    newNode->next = curr->next;
    curr->next = newNode;

    return head;

}

//Time Complexity: O(n)
//Auxiliary Space: O(n) 
Node* reverse_sll(Node* head){
    if (head == nullptr) return nullptr;
    std::stack <Node*> st;
    Node* current = head;
    st.push(nullptr);
    while (current->next != nullptr){
        st.push(current);
        current = current->next;
    }
    std::cout << current->data << std::endl;
    std::cout << st.size() << std::endl;
    head = current;
    for(int i = st.size(); i > 0; i--){
        current-> next = st.top();
        st.pop();
        current = current->next;
    }
    return head;
}

//Time Complexity: O(n)
//Auxiliary Space: O(1) 
Node* iterative_reverse_sll(Node* head){
    if (head == nullptr) return nullptr;
    Node* prev = nullptr;
    Node* current = head;
    while (current->next != nullptr){
        Node* next = current -> next;
        current-> next = prev;
        prev = current;
        current = next;
    }
    current -> next = prev;
    return current;
    
}//Time Complexity: O(n)
//Auxiliary Space: O(1) 
Node* recursive_reverse_sll(Node* head){
    if (head == NULL || head->next == NULL)
    return head;

    // reverse the rest of linked list and put
    // the first element at the end
    Node *rest = recursive_reverse_sll(head->next);

    // Make the current head as last node of
    // remaining linked list
    head->next->next = head;

    // Update next of current head to NULL
    head->next = NULL;

    return rest;
}

int main(){
    Node* head = new Node(10);
    head->next = new Node(20);
    head->next->next = new Node(30);
    head->next->next->next = new Node(40);
    head = iterative_reverse_sll(head);
    traverse_sll(head);
}