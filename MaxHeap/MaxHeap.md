## MaxHeap
├── Language
│ └── C++
├── Description
├
├── Methods
│ ├── insert(value)
│ │ ├── Description
│ │ │ └── Inserts a new value into the heap and restores
│ │ │ heap property using up-heapify.
│ │ ├── Time Complexity
│ │ │ └── O(log n)
│ │ └── Space Complexity
│ │ └── O(1)
│ │
│ ├── upHeapify(i)
│ │ ├── Description
│ │ │ └── Moves the element at index i upward until
│ │ │ the max-heap property is restored.
│ │ ├── Time Complexity
│ │ │ └── O(log n)
│ │ └── Space Complexity
│ │ └── O(1)
│ │
│ ├── downHeapify(i)
│ │ ├── Description
│ │ │ └── Pushes the element at index i downward to
│ │ │ maintain the heap property after deletion.
│ │ ├── Time Complexity
│ │ │ └── O(log n)
│ │ └── Space Complexity
│ │ └── O(1)
│ │
│ ├── extractMax()
│ │ ├── Description
│ │ │ └── Removes and returns the maximum element (root)
│ │ │ from the heap.
│ │ ├── Time Complexity
│ │ │ └── O(log n)
│ │ └── Space Complexity
│ │ └── O(1)
│ │
│ └── getMax()
│ ├── Description
│ │ └── Returns the maximum element without removing it.
│ ├── Time Complexity
│ │ └── O(1)
│ └── Space Complexity
│ └── O(1)