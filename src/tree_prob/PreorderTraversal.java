package tree_prob;

import java.util.ArrayList;

public class PreorderTraversal {
	public ArrayList<Integer> preorderTraversal(TreeNode node) {
		TreeNode current = node, pred;
		ArrayList<Integer> ansList = new ArrayList<>();
		while (current != null) {
			if (current.left == null) {
				ansList.add(current.val);
				current = current.right;
			} else {
				pred = current.left;
				while (pred.right != null && pred.right != current) {
					pred = pred.right;
				}
				if (pred.right == null) {
					ansList.add(current.val);
					pred.right = current;
					current = current.left;
				} else {
					pred.right = null;
					current = current.right;
				}
			}

		}
		return ansList;
	}

}
