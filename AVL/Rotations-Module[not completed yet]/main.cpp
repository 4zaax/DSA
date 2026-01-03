#include "header.h"
class Node {
    public:
        int key;
        int BF;
        Node* right;
        Node* left;

        Node(int key = 0){
            this->key = key;
            this->BF = 0;
            this->right = nullptr;
            this->left = nullptr;
        }

        int getKey(void){
            return this->key;
        }
    private:
};

int main(){
    Node* A = new Node('A');
    Node* C = new Node('C');
    Node* B = new Node('B');
    A->right = C;
    C->left = B;
    
    int key = A->getKey();
    cout << key << endl;
}