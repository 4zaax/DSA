```
BST
├── Language
│   └── Java
├── Description
│   └── Binary Search Tree (BST) where for every node:
│       left subtree keys < node.key < right subtree keys
├── Methods
│   ├── search(key)
│   │   ├── Description
│   │   │   └── Checks if a key exists in the tree.
│   │   ├── Time Complexity
│   │   │   └── O(h)  (worst O(n), best O(log n) if balanced)
│   │   └── Space Complexity
│   │       └── O(h) (recursive calls)
│   │
│   ├── findNode(key)
│   │   ├── Description
│   │   │   └── Returns the node containing the key (or null).
│   │   ├── Time Complexity
│   │   │   └── O(h)
│   │   └── Space Complexity
│   │       └── O(h)
│   │
│   ├── findParent(node)
│   │   ├── Description
│   │   │   └── Returns parent of a given node reference (or null).
│   │   ├── Time Complexity
│   │   │   └── O(h)
│   │   └── Space Complexity
│   │       └── O(1)
│   │
│   ├── findParentByKey(key)
│   │   ├── Description
│   │   │   └── Returns parent of the node that has this key (or null).
│   │   ├── Time Complexity
│   │   │   └── O(h)
│   │   └── Space Complexity
│   │       └── O(1)
│   │
│   ├── minNode()
│   │   ├── Description
│   │   │   └── Returns the node with minimum key in the tree.
│   │   ├── Time Complexity
│   │   │   └── O(h)
│   │   └── Space Complexity
│   │       └── O(1)
│   │
│   ├── maxNode()
│   │   ├── Description
│   │   │   └── Returns the node with maximum key in the tree.
│   │   ├── Time Complexity
│   │   │   └── O(h)
│   │   └── Space Complexity
│   │       └── O(1)
│   │
│   ├── successor(node)
│   │   ├── Description
│   │   │   └── Returns in-order successor of the given node (or null).
│   │   ├── Time Complexity
│   │   │   └── O(h)
│   │   └── Space Complexity
│   │       └── O(1)
│   │
│   ├── predecessor(node)
│   │   ├── Description
│   │   │   └── Returns in-order predecessor of the given node (or null).
│   │   ├── Time Complexity
│   │   │   └── O(h)
│   │   └── Space Complexity
│   │       └── O(1)
│   │
│   ├── insert(key)
│   │   ├── Description
│   │   │   └── Inserts a key into the BST while maintaining BST property.
│   │   ├── Time Complexity
│   │   │   └── O(h)
│   │   └── Space Complexity
│   │       └── O(h) (recursive calls)
│   │
│   ├── delete(key)
│   │   ├── Description
│   │   │   └── Deletes a node by key (handles 0, 1, or 2 children cases).
│   │   ├── Time Complexity
│   │   │   └── O(h)
│   │   └── Space Complexity
│   │       └── O(h) (recursive calls)
│   │
│   ├── inorder()
│   │   ├── Description
│   │   │   └── Prints keys in sorted order (LNR).
│   │   ├── Time Complexity
│   │   │   └── O(n)
│   │   └── Space Complexity
│   │       └── O(h)
│   │
│   ├── preorder()
│   │   ├── Description
│   │   │   └── Prints keys in root-left-right order (NLR).
│   │   ├── Time Complexity
│   │   │   └── O(n)
│   │   └── Space Complexity
│   │       └── O(h)
│   │
│   ├── postorder()
│   │   ├── Description
│   │   │   └── Prints keys in left-right-root order (LRN).
│   │   ├── Time Complexity
│   │   │   └── O(n)
│   │   └── Space Complexity
│   │       └── O(h)
│   │
│   ├── height()
│   │   ├── Description
│   │   │   └── Returns height of the tree (max edges from root to leaf).
│   │   ├── Time Complexity
│   │   │   └── O(n)
│   │   └── Space Complexity
│   │       └── O(h)
│   │
│   └── depth(node)
│       ├── Description
│       │   └── Returns depth of a given node (edges from root to node).
│       ├── Time Complexity
│       │   └── O(h)
│       └── Space Complexity
│           └── O(1)

```