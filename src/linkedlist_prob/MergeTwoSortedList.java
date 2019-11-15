package linkedlist_prob;

public class MergeTwoSortedList {
	public ListNode mergeTwoLists(ListNode aList, ListNode bList) {
		ListNode newList = null, cList = null;
		while (aList != null && bList != null) {
			if (aList.val < bList.val) {
				cList = this.addToList(cList, aList);
				aList = aList.next;
			} else {
				cList = this.addToList(cList, bList);
				bList = bList.next;
			}

			if (newList == null)
				newList = cList;
			else
				cList = cList.next;

		}
		if (aList != null) {
			cList.next = aList;
		} else {
			cList.next = bList;
		}
		return newList;
	}

	public ListNode addToList(ListNode cList, ListNode aList) {
		if (cList == null) {
			return aList;
		}
		cList.next = aList;
		return cList;
	}

	public static void main(String[] args) {
		ListNode root = new ListNode(1);
		root.next = new ListNode(2);
		root.next.next = new ListNode(3);
		ListNode root2 = new ListNode(4);
		root2.next = new ListNode(4);
		root2.next.next = new ListNode(5);
		root2.next.next.next = new ListNode(6);
		new MergeTwoSortedList().mergeTwoLists(root, root2);
	}

}
