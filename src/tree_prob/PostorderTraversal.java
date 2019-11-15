package tree_prob;

import java.util.ArrayList;

public class PostorderTraversal {
	public ArrayList<Integer> postorderTraversal(TreeNode aTree) {
		ArrayList<Integer> ansList = new ArrayList<>();
		TreeNode dummyNode = new TreeNode(0);
		dummyNode.left = aTree;
		// Think of 'current' as the current TreeNode
		TreeNode current = dummyNode, pred = null, t1 = null, t2 = null, t3 = null;
		while (current != null) {
			if (current.left == null) {
				current = current.right;
			} else {
				/*
				 * 'current' has a left child => it also has a predeccessor make 'current' as
				 * right child predeccessor of 'current'
				 */
				pred = current.left;
				while (pred.right != null && pred.right != current)
					pred = pred.right;
				if (pred.right == null) {
					// predeccessor found for first time
					// modify the tree
					pred.right = current;
					current = current.left;
				} else {
					// predeccessor found second time
					// reverse the right references in chain from pred to 'current'
					t1 = current;
					t2 = current.left;
					while (t2 != current) {
						t3 = t2.right;
						t2.right = t1;
						t1 = t2;
						t2 = t3;
					}
					// visit the nodes from pred to 'current'
					// again reverse the right references from pred to 'current'
					t1 = pred.right;
					t2 = pred;
					while (t2 != current) {
						ansList.add(t2.val);
						t3 = t2.right;
						t2.right = t1;
						t1 = t2;
						t2 = t3;
					}
					t1 = t2 = t3 = null;
					// remove the pred to TreeNode reference to restore the tree structure
					pred.right = null;
					current = current.right;

				}

			}
		}
		return ansList;
	}
}
