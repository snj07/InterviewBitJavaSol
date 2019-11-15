package linkedlist_prob;

public class ReverseLinkedList2 {
	public ListNode reverseBetween(ListNode aList, int m, int n) {
		int pos = 1;
		ListNode l1 = null, l2 = aList, head = aList;
		while (pos != m) {
			l1 = l2;
			l2 = l2.next;
			pos++;
		}
		ListNode prev = null, curr = l2;
		while (pos <= n) {
			ListNode temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
			pos++;
		}
		if (m == 1) {
			head = prev;
		} else {
			l1.next = prev;
		}
		l2.next = curr;
		return head;
	}

}
