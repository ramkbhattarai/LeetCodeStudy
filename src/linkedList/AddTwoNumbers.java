package linkedList;
/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 * @author ramkrishnabhattarai
 *
 */
public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;
        int carryover = 0;
        while(l1 != null || l2 != null){
            int x = l1 != null ? l1.val : 0; // this is to get the value we want when node is not null
            int y = l2 != null ? l2.val : 0;
            int val = x + y + carryover; // initially carry over is 0 and later it will be added to the next node
            carryover = val / 10;
            ListNode next = new ListNode(val % 10); // here we just want the remainder of the total sum
            dummy.next = next;
           if(l1 != null) l1 = l1.next; // this is to check if node is null or not if it is then we don't move forward
           if(l2 != null) l2 = l2.next; // this is to check if node is null or not
            dummy = dummy.next;
        }
        if(carryover > 0) dummy.next = new ListNode(carryover); // this is for edge case
        return result.next;
    }
}
