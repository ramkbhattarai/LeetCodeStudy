package linkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

Follow up:

Can you solve it using O(1) (i.e. constant) memory?

 

Example 1:


Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
Example 2:


Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
Example 3:


Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.
 

Constraints:

The number of the nodes in the list is in the range [0, 104].
-105 <= Node.val <= 105
pos is -1 or a valid index in the linked-list.
 * @author ramkrishnabhattarai
 *
 */




 
public class CheckCycle {
	
	
	// using hashset  O(n) time and space
	public boolean hasCycle1(ListNode head) {
	    Set<ListNode> nodesSeen = new HashSet<>();
	    while (head != null) {
	        if (nodesSeen.contains(head)) {
	            return true;
	        } else {
	            nodesSeen.add(head);
	        }
	        head = head.next;
	    }
	    return false;
	}
	
	public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
	
	// approach 3 
	public boolean hasCycle3(ListNode head) {
		// Initialize slow & fast pointers
		ListNode slow = head;
		ListNode fast = head;
		/**
		 * Change this condition to fit specific problem.
		 * Attention: remember to avoid null-pointer error
		 **/
		while (slow != null && fast != null && fast.next != null) {
		    slow = slow.next;           // move slow pointer one step each time
		    fast = fast.next.next;      // move fast pointer two steps each time
		    if (slow == fast) {         // change this condition to fit specific problem
		        return true;
		    }
		}
		return false;   // change return value to fit specific problem
	}

}
