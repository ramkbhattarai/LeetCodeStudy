package linkedList;

public class IntersectionOfTwoLinkedList {
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        int len_a = 0;
        while(currA != null){
            currA = currA.next;
            len_a++;
        }
        int len_b = 0;
        ListNode currB = headB;
        while(currB != null){
            currB = currB.next;
            len_b++;
        }
        int counter = len_a -len_b;
        if(counter < 0){
            while(counter != 0){
                headB = headB.next;
                counter++;
            }
        }else if(counter > 0){
            while(counter != 0){
                headA = headA.next;
                counter--;
            }
        }
        
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

}
