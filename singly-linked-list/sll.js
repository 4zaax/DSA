class Node {
    constructor(data){
        this.data = data;
        this.next = null;
    }
}

function traverse_sll(head){
    while (head != null){
        console.log(head.data.toString());
        head = head.next;
    }
}

function insert_begin_sll(head, key){
    let newFirst = new Node(key);
    newFirst.next = head;
    return newFirst;
}

let head = new Node(10);
head.next = new Node(20);
head.next.next = new Node(30)
head.next.next.next = new Node(40);

head = insert_begin_sll(head, 50);
traverse_sll(head);