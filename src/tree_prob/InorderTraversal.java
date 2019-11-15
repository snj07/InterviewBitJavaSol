package tree_prob;

import java.util.ArrayList;

public class InorderTraversal {
	public ArrayList<Integer> inorderTraversal(TreeNode node) {
		TreeNode current, pred;
		ArrayList<Integer> ansList = new ArrayList<>();
		if (node == null)
			return ansList;
		current = node;
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
					pred.right = current;
					current = current.left;
				} else {
					pred.right = null;
					ansList.add(current.val);
					current = current.right;
				}
			}

		}
		return ansList;
	}

//O(n) space
//	public ArrayList<Integer> inorderTraversal(TreeNode root) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
//
//		Stack<TreeNode> stack = new Stack<TreeNode>();
//		TreeNode cur = root;
//
//		while (cur != null || !stack.empty()) {
//			while (cur != null) {
//				stack.add(cur);
//				cur = cur.left;
//			}
//			cur = stack.pop();
//			list.add(cur.val);
//			cur = cur.right;
//		}
//
//		return list;
//	}

}
