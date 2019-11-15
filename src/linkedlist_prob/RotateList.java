package linkedlist_prob;

/*
 * https://www.interviewbit.com/problems/rotate-list/
 */
public class RotateList {
	public ListNode rotateRight(ListNode aList, int k) {
		int l = this.calLength(aList);
		if (l == k || k % l == 0)
			return aList;
		k = k % l;
		int n = l - k + 1;
		ListNode prev = null, curr = aList, head = null;
		while (n-- > 1) {
			prev = curr;
			curr = curr.next;
		}
		prev.next = null;
		head = curr;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = aList;
		return head;
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
