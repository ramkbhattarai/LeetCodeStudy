package linkedList;
/**
 * Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
 * @author ramkrishnabhattarai
 *
 */

public class MergeTwoSortedList {
	

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode currHead1 = l1;
        ListNode currHead2 = l2;
        ListNode result = new ListNode(-1);
        ListNode dummy = result;
        while(currHead1 != null && currHead2 != null){
            if(currHead1.val <= currHead2.val){
                result.next = currHead1;
                currHead1 = currHead1.next;
            }else{
               result.next = currHead2;
                currHead2 = currHead2.next;
            }
            result = result.next;
            
        }
         if(currHead1 != null){
              result.next = currHead1;
        }
        if(currHead2 != null){
               result.next = currHead2;
        }
       return dummy.next; 
    }

}
