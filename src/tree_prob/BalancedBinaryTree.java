package tree_prob;

//  Definition for binary tree 
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
		left = null;
		right = null;
	}
}

public class BalancedBinaryTree {
	class Height {
		int d;

		public Height(int h) {
			this.d = h;
		}
	}

	public int isBalanced(TreeNode A) {

		return isBalanced(A, new Height(0)) ? 1 : 0;
	}

	public boolean isBalanced(TreeNode A, Height h) {

		if (A == null) {
			h.d = 0;
			return true;
		}

		Height l = new Height(0);
		Height r = new Height(0);
		if (!isBalanced(A.left, l) || !isBalanced(A.right, r)) {
			return false;
		}

		h.d = Math.max(l.d, r.d) + 1;
		if (Math.abs(l.d - r.d) <= 1) {
			return true;
		}
		return false;
	}
}
