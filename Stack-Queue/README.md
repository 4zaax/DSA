```
DSA/
├── StackQueue/
│   ├── StackArray.java
│   ├── QueueArray.java
└   └── QueueSLL.java


StackArray
├── Language
│   └── Java
├── Description
│   └── Stack implemented using a dynamic array.
│       Follows LIFO (Last In First Out) principle.
├── Methods
│   ├── push(value)
│   │   ├── Description
│   │   │   └── Inserts an element at the top of the stack.
│   │   ├── Time Complexity
│   │   │   └── O(1) amortized
│   │   └── Space Complexity
│   │       └── O(1)
│   │
│   ├── pop()
│   │   ├── Description
│   │   │   └── Removes the top element from the stack.
│   │   ├── Time Complexity
│   │   │   └── O(1)
│   │   └── Space Complexity
│   │       └── O(1)
│   │
│   ├── peek()
│   │   ├── Description
│   │   │   └── Prints the top element without removing it.
│   │   ├── Time Complexity
│   │   │   └── O(1)
│   │   └── Space Complexity
│   │       └── O(1)
│   │
│   └── show()
│       ├── Description
│       │   └── Prints all elements in the stack from bottom to top.
│       ├── Time Complexity
│       │   └── O(n)
│       └── Space Complexity
│           └── O(1)



QueueArray
├── Language
│   └── Java
├── Description
│   └── Queue implemented using a circular array (snake-like movement).
│       Follows FIFO (First In First Out) principle.
├── Methods
│   ├── enqueue(value)
│   │   ├── Description
│   │   │   └── Inserts an element at the rear of the queue.
│   │   ├── Time Complexity
│   │   │   └── O(1) amortized
│   │   └── Space Complexity
│   │       └── O(1)
│   │
│   ├── dequeue()
│   │   ├── Description
│   │   │   └── Removes the front element from the queue.
│   │   ├── Time Complexity
│   │   │   └── O(1)
│   │   └── Space Complexity
│   │       └── O(1)
│   │
│   ├── front()
│   │   ├── Description
│   │   │   └── Prints the element at the front of the queue.
│   │   ├── Time Complexity
│   │   │   └── O(1)
│   │   └── Space Complexity
│   │       └── O(1)
│   │
│   ├── back()
│   │   ├── Description
│   │   │   └── Prints the element at the rear of the queue.
│   │   ├── Time Complexity
│   │   │   └── O(1)
│   │   └── Space Complexity
│   │       └── O(1)
│   │
│   └── show()
│       ├── Description
│       │   └── Displays all queue elements in correct order.
│       ├── Time Complexity
│       │   └── O(n)
│       └── Space Complexity
│           └── O(1)




QueueSLL
├── Language
│   └── Java
├── Description
│   └── Queue implemented using a Singly Linked List (SLL).
│       Follows FIFO (First In First Out) principle.
├── Methods
│   ├── enqueue(value)
│   │   ├── Description
│   │   │   └── Inserts an element at the back of the queue by adding
│   │   │       it to the linked list.
│   │   ├── Time Complexity
│   │   │   └── O(n)
│   │   └── Space Complexity
│   │       └── O(1)
│   │
│   ├── dequeue()
│   │   ├── Description
│   │   │   └── Removes the front element by moving head to head.next.
│   │   ├── Time Complexity
│   │   │   └── O(1)
│   │   └── Space Complexity
│   │       └── O(1)
│   │
│   ├── front()
│   │   ├── Description
│   │   │   └── Prints the front element (head of the linked list).
│   │   ├── Time Complexity
│   │   │   └── O(1)
│   │   └── Space Complexity
│   │       └── O(1)
│   │
│   ├── back()
│   │   ├── Description
│   │   │   └── Prints the last element by traversing the linked list.
│   │   ├── Time Complexity
│   │   │   └── O(n)
│   │   └── Space Complexity
│   │       └── O(1)
│   │
│   └── show()
│       ├── Description
│       │   └── Prints the queue elements using the linked list output.
│       ├── Time Complexity
│       │   └── O(n)
│       └── Space Complexity
│           └── O(1)


```