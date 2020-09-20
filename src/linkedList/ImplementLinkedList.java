package linkedList;
/**
 * Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and next is a pointer/reference to the next node.
If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.

Implement the MyLinkedList class:

MyLinkedList() Initializes the MyLinkedList object.
int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
void addAtHead(int val) Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
void addAtTail(int val) Append a node of value val as the last element of the linked list.
void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list. If index equals the length of the linked list, the node will be appended to the end of the linked list. If index is greater than the length, the node will not be inserted.
void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.
 

Example 1:

Input
["MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get"]
[[], [1], [3], [1, 2], [1], [1], [1]]
Output
[null, null, null, null, 2, null, 3]

Explanation
MyLinkedList myLinkedList = new MyLinkedList();
myLinkedList.addAtHead(1);
myLinkedList.addAtTail(3);
myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
myLinkedList.get(1);              // return 2
myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
myLinkedList.get(1);              // return 3
 

Constraints:

0 <= index, val <= 1000
Please do not use the built-in LinkedList library.
At most 2000 calls will be made to get, addAtHead, addAtTail,  addAtIndex and deleteAtIndex.
 * @author ramkrishnabhattarai
 *
 */

public class ImplementLinkedList {
	private int size = 0;
    private Node head = null;
    
    public class Node{
        private int val;
        private Node next;
        public Node(int val){this.val = val;}
    }

    /** Initialize your data structure here. */
    public ImplementLinkedList() {
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index < 0) return -1;
        if(index >= size) return -1;
        Node curr = this.head;
        for(int i = 0; i < index; i++){
            curr = curr.next;
        }
        return curr.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node curr = new Node(val);
        curr.next = this.head;
         this.head = curr;
        this.size++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        Node curr = this.head;
        for(int i = 0; i < this.size; i++) curr = curr.next;
        curr.next = newNode;
        this.size++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index > size || index < 0) return;
        if(index == 0){
            addAtHead(val);
        }else if(index == this.size){
            addAtTail(val);
        }else{
            Node curr = this.head;
            Node newNode = new Node(val);
            for(int i = 0; i < index -1; i++) curr = curr.next;
            newNode.next = curr.next.next;
            curr.next = newNode;
        }
        this.size++;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index > size || index < 0) return;
        if(index == 0){
            Node curr = this.head;
             this.head = curr.next;
        }else {
            Node curr = this.head;
            for(int i = 0; i < index -1; i++) curr = curr.next;
            curr.next = null;
        }
        this.size--;
    }

}
