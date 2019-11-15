package linkedlist_prob;

public class RemoveDuplicateFromSortedList2 {

	public ListNode deleteDuplicates(ListNode aList) {
		ListNode head = aList, x = aList, y = aList.next, prev=aList;
        boolean flag = false;
        while (y != null) {
            if (x.val == y.val) {
                y = y.next;
                flag = true;
            } else {
                if(flag){
                    flag = false;
                    if(x==head){
                        head = y;
                        prev = head;
                    }else{
                        prev.next = y;
                    }
                }else{
                    prev = x;
                }
                x = y;
                y = y.next;
            }

        }
        if(flag){
            if(x==head){
                head=null;
            }else if(prev!=null){
               prev.next = null;
            }
        }
        return head;
	}
}
