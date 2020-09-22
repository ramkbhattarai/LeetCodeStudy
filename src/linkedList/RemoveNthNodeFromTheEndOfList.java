package linkedList;
/**
 * Given a linked list, remove the n-th node from the end of list and return its head.

Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:

Given n will always be valid.

Follow up:

Could you do this in one pass?
 * @author ramkrishnabhattarai
 *
 */

public class RemoveNthNodeFromTheEndOfList {
	
	// 1st approach
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int length = 0;
        while(curr != null){
            curr = curr.next;
            length++;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int remove = length -n;
        ListNode prev = dummy;
        while(remove > 0){
            prev = prev.next;
            remove--;
        }
        prev.next = prev.next.next;
        return dummy.next;
        
    }

}
