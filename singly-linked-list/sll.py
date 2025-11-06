class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        
def traverse_sll(head):
    while (head != None):
        print(head.data, sep=" ");
        head=head.next;
    print("\n")

def insert_begin_sll(head, key):
    newFirst = Node(key)
    newFirst.next = head
    return newFirst

def insert_end_sll (head, key):
    newNode = Node(key);
    if (head == None):
        return newNode
    current = head
    while (current.next != None):
        current = current.next
    current.next = newNode
    return head
    
def insert_by_index(head, val, pos):
    newNode = Node(val);
    if (pos <= 1):
        newNode.next = head;
        return newNode
    current = head
    for i in range(pos-2):
        if (current.next != None):
            current = current.next
        else:
            break;
    newNode.next = current.next
    current.next = newNode
    return head

def recursive_reverse_sll(head):
    if head is None or head.next is None :
        return head
    rest = recursive_reverse_sll(head.next);
    head.next.next = head;
    head.next = None
    return rest



head = Node(10)
head.next = Node(20)
head.next.next = Node(30)
head.next.next.next = Node(40)
head.next.next.next.next = Node(10)
head.next.next.next.next.next = Node(70)
newhead = insert_end_sll(None, 150)
traverse_sll(newhead)