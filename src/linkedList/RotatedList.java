package linkedList;
/**
 * Given a linked list, rotate the list to the right by k places, where k is non-negative.

Example 1:

Input: 1->2->3->4->5->NULL, k = 2
Output: 4->5->1->2->3->NULL
Explanation:
rotate 1 steps to the right: 5->1->2->3->4->NULL
rotate 2 steps to the right: 4->5->1->2->3->NULL
Example 2:

Input: 0->1->2->NULL, k = 4
Output: 2->0->1->NULL
Explanation:
rotate 1 steps to the right: 2->0->1->NULL
rotate 2 steps to the right: 1->2->0->NULL
rotate 3 steps to the right: 0->1->2->NULL
rotate 4 steps to the right: 2->0->1->NULL
 * @author ramkrishnabhattarai
 *
 */
public class RotatedList {
	public class ListNode {
		     int val;
		     ListNode next;
		     ListNode() {}
		     ListNode(int val) { this.val = val; }
		     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }
	
	public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        if(k < 1) return head;
        if(head.next == null) return head;
        ListNode dummy = head;
        ListNode originalHead = head;
        ListNode currentHead = head;
        ListNode toBeShifted = null;
        
        int length = 0;
        while(dummy != null){
            dummy = dummy.next;
            length++;
        }
       if(k % length == 0) return head;
        int rem = k % length;
        int j = 0;
        while(j < rem){
            int i = 0;
            while(i < length -2){
                currentHead = currentHead.next;
                i++;
            }
            toBeShifted = currentHead.next;
            toBeShifted.next = originalHead;
            currentHead.next = null;
            originalHead = toBeShifted;
            currentHead = toBeShifted;
            j++;
        }
       return toBeShifted; 
    }
	
	// better approach
	public ListNode rotateRight2(ListNode head, int k) {
	// if(head==NULL||head->next==NULL)return head;
    int count = 1;
    ListNode cur = head;
    while(cur.next != null){
        cur=cur.next;
        count++;
    }
    if(k%count==0)return head;
    cur.next=head;//make a circle
    k%=count;
    for(int i=0;i<count-k;++i){
        cur=cur.next;
    }
    head=cur.next;
    cur.next=null;//untie the circle
    return head;
	}
}
