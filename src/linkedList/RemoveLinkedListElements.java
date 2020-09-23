package linkedList;
/**
 * Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
 * @author ramkrishnabhattarai
 *
 */
public class RemoveLinkedListElements {
	 public ListNode removeElements(ListNode head, int val) {
	        ListNode dummy = new ListNode(0);
	        dummy.next = head;
	        ListNode prev = dummy;
	        ListNode curr = head;
	        while(curr != null){
	            if(curr.val != val){
	                prev = curr;
	                curr = curr.next;
	            }else{
	                prev.next = curr.next;
	                curr = curr.next;
	            }
	            
	        }
	        return dummy.next;
	    }
}
