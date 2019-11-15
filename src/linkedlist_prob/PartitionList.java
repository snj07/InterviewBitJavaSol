package linkedlist_prob;

/*
 * https://www.interviewbit.com/problems/partition-list/
 */
public class PartitionList {
	public ListNode partition(ListNode aList, int b) {
		ListNode root = aList;
		ListNode t1Node = root, t2Node = root.next, x1Node, x2Node, t2Next;
		while (t2Node != null) {
			if (t2Node.val < b && t1Node != null) {
				x1Node = null;
				x2Node = root;
				while ((x2Node.val <= t2Node.val || x2Node.val < b) && x2Node != t2Node) {
					x1Node = x2Node;
					x2Node = x2Node.next;
				}
				if (x2Node == t2Node) {
					t1Node = t2Node;
					t2Node = t2Node.next;
					continue;
				}
				if (x1Node == null) {
					t2Next = t2Node.next;
					t2Node.next = root;
					root = t2Node;
				} else {
					t2Next = t2Node.next;
					x1Node.next = t2Node;
					t2Node.next = x2Node;
				}
				t2Node = t2Next;
				t1Node.next = t2Next;

			} else {
				t1Node = t2Node;
				t2Node = t2Node.next;
			}
		}
		return root;
	}
}
