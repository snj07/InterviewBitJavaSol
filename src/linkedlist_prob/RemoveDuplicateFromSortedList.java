package linkedlist_prob;

public class RemoveDuplicateFromSortedList {
	public ListNode deleteDuplicates(ListNode aList) {
		ListNode ans = aList, x = aList, y = aList.next;
		while (y != null) {
			if (x.val == y.val) {
				x.next = y.next;
				y = y.next;
			} else {
				x = x.next;
				y = y.next;
			}

		}
		return ans;
	}

}
