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
 * @author ramkrishnabhattarai
 *
 */

public class ImplementDoublyLinkedList {
	
	int length;
    Node head;
    class Node {
        int val;
        Node next;
        Node prev;
        Node(int x) {
            this.val = x;
        }    
    }
    
    public ImplementDoublyLinkedList(){
        this.length = 0;
        this.head = null;
    }
    
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index < 0 || index >= this.length) {
            return -1;
        }
        else {
            int counter = 0;
            Node curr = head;
            while(counter != (index)) {
                curr = curr.next;
                counter++;
            }
            return curr.val;
        }
        
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = this.head;
        this.head = newNode;
        this.length++; 
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if(this.length == 0) {
            addAtHead(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        this.length++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val);
        Node temp = head;
        int counter = 0;
        if((index) == this.length) {
            addAtTail(val);
            return;
        }
        if(index > this.length) {
            return;
        }
        if(index == 0){
            addAtHead(val);
            return;
        }
        while(counter != (index -1)) {
            temp = temp.next;
            counter++;
        }
        newNode.prev = temp;
        newNode.next = temp.next;
        newNode.next.prev = newNode;
        temp.next = newNode; 
        this.length++;
 
        
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public  void deleteAtIndex(int index) {
        
        if(index < 0 || index >= this.length) {
            return;
        }
        Node curr = head;
        if(index == 0) {
            head = curr.next;
        }
        else {
                Node current = head;
                Node pre = null;
                int counter =0;
                while(counter != index) {
                    pre = current;
                    current = current.next;
                    counter++;
                }
                pre.next = current.next;
               
        }  
         this.length--;
    }

    
    
    public static void main(String[] args) {
    	ImplementDoublyLinkedList ll = new ImplementDoublyLinkedList();
    	ll.addAtHead(1);
    	
    	ll.addAtTail(2);
    	ll.addAtHead(3);
    	ll.addAtTail(4);
    	ll.addAtIndex(3, 30);
    	ll.deleteAtIndex(3);
    	Node h1 = ll.head;
    	while(h1 != null) {
    		System.out.println(h1.val);
    		h1 = h1.next;
    	}
//    	
//    	
//    	ll.deleteAtIndex(2);
//    	
//    	int x = ll.get(2);
//    	System.out.println(x);
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    // better approach
//    
//    /** Initialize your data structure here. */
//    class DListNode {
//        int val;
//        DListNode next;
//        DListNode prev;
//        DListNode (int val) {
//            this.val = val;
//        }
//    }
//    
//    DListNode head;
//    DListNode tail;
//    /** Initialize your data structure here. */
//    public MyLinkedList() {
//        head = new DListNode(0);
//        tail = new DListNode(0);
//        head.prev = null;
//        head.next = tail;
//        tail.prev = head;
//        tail.next = null;
//    }
//    
//    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
//    public int get(int index) {
//        int i = 0;
//        DListNode cur = head.next;  
//        while (cur != tail) {
//            if (i++ == index) return cur.val;
//            cur = cur.next;
//        }
//        return -1;
//    }
//    
//    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
//    public void addAtHead(int val) {
//        DListNode node = new DListNode(val);
//        node.prev = head;
//        node.next = head.next;
//        head.next.prev = node;
//        head.next = node;
//    }
//    
//    /** Append a node of value val to the last element of the linked list. */
//    public void addAtTail(int val) {
//        DListNode node = new DListNode(val);
//        node.prev = tail.prev;
//        node.next = tail;
//        tail.prev.next = node;
//        tail.prev = node;
//    }
//    
//    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
//    public void addAtIndex(int index, int val) {
//        DListNode node = new DListNode(val);
//        int i = 0;
//        DListNode cur = head;
//        while (cur != tail) {
//            if (i++ == index) {
//                node.prev = cur;
//                node.next = cur.next;
//                cur.next.prev = node;
//                cur.next = node;
//                return;
//            }
//            cur = cur.next;
//        }
//    }
//    
//    /** Delete the index-th node in the linked list, if the index is valid. */
//    public void deleteAtIndex(int index) {
//        int i = 0;
//        DListNode cur = head;
//        while (cur != tail && cur.next != tail) {   
//            if (i++ == index) {
//                cur.next.next.prev = cur;
//                cur.next = cur.next.next;
//                return;
//            }
//            cur = cur.next;
//        }
//    }

}
