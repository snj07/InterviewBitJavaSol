package linkedlist_prob;

public class RemoveNthNodeFromListEnd {
	public ListNode removeNthFromEnd(ListNode aList, int b) {
		int l = this.calLength(aList);
		int n = l - b + 1;
		if (b > l || n == 1) {
			aList = aList.next;
			return aList;
		}

		ListNode prev = null, curr = aList;
		while (n-- > 1) {
			prev = curr;
			curr = prev.next;
		}
		if (curr != null) {
			prev.next = curr.next;
		}
		return aList;

	}

	public int calLength(ListNode aList) {
		int c = 0;
		while (aList != null) {
			++c;
			aList = aList.next;
		}
		return c;
	}

}
