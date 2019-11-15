package tree_prob;

/*
 * https://www.interviewbit.com/problems/populate-next-right-pointers-tree/
 */
class TreeLinkNode {
	int val;
	TreeLinkNode left, right, next;

	TreeLinkNode(int x) {
		val = x;
	}
}

public class PopulateNextRightPointersTtree {
	public void connect(TreeLinkNode root) {
		TreeLinkNode parent = root, childhead = null, child = null;
		while (parent != null) {
			while (parent != null) {
				if (parent.left != null) {
					if (childhead != null) {
						child.next = parent.left;
					} else {
						childhead = parent.left;
					}
					child = parent.left;
				}
				if (parent.right != null) {
					if (childhead != null) {
						child.next = parent.right;
					} else {
						childhead = parent.right;
					}
					child = parent.right;
				}
				parent = parent.next;
			}

			parent = childhead;
			child = childhead = null;
		}

	}
}
