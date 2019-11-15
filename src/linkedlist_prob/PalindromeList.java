package linkedlist_prob;

class ListNode {
	public int val;
	public ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class PalindromeList {

	public int lPalin(ListNode aList) {
		ListNode sPtr = aList, fPtr = aList, ptr;
		while (sPtr != null && fPtr != null && fPtr.next != null) {
			sPtr = sPtr.next;
			fPtr = fPtr.next.next;
		}
		if (fPtr == null) {
			ptr = reverseSubList(sPtr);
			return this.compareList(aList, sPtr, ptr);
		}
		ptr = reverseSubList(sPtr.next);
		return this.compareList(aList, sPtr.next, ptr);
	}

	public ListNode reverseSubList(ListNode lt) {
		ListNode x = null, y = lt, t = null;
		while (y != null) {
			t = y.next;
			y.next = x;
			x = y;
			y = t;
		}
		return x;
	}

	public int compareList(ListNode l1, ListNode et, ListNode l2) {
		while (l1 != et && l2 != null) {
			System.out.println(l1.val + "==" + l2.val);
			if (l1.val != l2.val)
				return 0;
			l1 = l1.next;
			l2 = l2.next;
		}
		return 1;
	}

	public static void main(String[] args) {
		ListNode root = new ListNode(1);
		root.next = new ListNode(2);
		root.next.next = new ListNode(3);
		root.next.next.next = new ListNode(3);
		root.next.next.next.next = new ListNode(2);
		root.next.next.next.next.next = new ListNode(1);
		System.out.println(new PalindromeList().lPalin(root));
	}
}
