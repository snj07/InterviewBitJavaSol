package tree_prob;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * https://www.interviewbit.com/problems/zigzag-level-order-traversal-bt/
 */
public class ZigZagLevelOrderTraversal {
	public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode aTree) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		if (aTree == null)
			return res;
		Queue<TreeNode> queue = new LinkedList<>();
		boolean zigzag = false;
		queue.add(aTree);
		while (!queue.isEmpty()) {
			int s = queue.size();
			ArrayList<Integer> lst = new ArrayList<>();
			for (int i = 0; i < s; i++) {
				TreeNode node = queue.poll();
				if (zigzag) {
					lst.add(0, node.val);
				} else {
					lst.add(node.val);
				}
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
			res.add(lst);
			zigzag = !zigzag;
		}
		return res;
	}
}
