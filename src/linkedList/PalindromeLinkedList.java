package linkedList;
/**
 * Given a singly linked list, determine if it is a palindrome.

Example 1:

Input: 1->2
Output: false
Example 2:

Input: 1->2->2->1
Output: true
Follow up:
Could you do it in O(n) time and O(1) space?
 * @author ramkrishnabhattarai
 *
 */
public class PalindromeLinkedList {
	 public ListNode reverseList(ListNode head) {
	        if(head == null || head.next == null) return head;
	        ListNode curr = head;
	        ListNode prev = null;
	        while(curr != null){
	            ListNode temp = curr.next;
	            curr.next = prev;
	            prev = curr;
	            curr = temp;
	            
	        }
	        return prev;
	    }
	    public boolean isPalindrome(ListNode head) {
	        if(head == null) return true;
	        ListNode slow = head;
	        ListNode fast = head;
	        while(fast.next != null && fast.next.next != null){
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        ListNode secondHalf = reverseList(slow.next);
	        ListNode firstHalf = head;
	        while(firstHalf != null && secondHalf != null){
	            if(secondHalf.val != firstHalf.val) return false;
	            secondHalf = secondHalf.next;
	            firstHalf = firstHalf.next;
	        }
	        return true;
	    }
}
