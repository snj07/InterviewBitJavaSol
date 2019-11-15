package tree_prob;

public class MaxDepthOfBinaryTree {
	int max = 0;

	public int maxDepth(TreeNode aTree) {
		this.max = 0;
		this.calMaxDepth(aTree, 0);
		return this.max;
	}

	public void calMaxDepth(TreeNode aTree, int d) {
		if (aTree == null)
			return;
		if (aTree.left == null && aTree.right == null) {
			d += 1;
			if (this.max < d)
				this.max = d;
			return;
		}
		this.calMaxDepth(aTree.left, d + 1);
		this.calMaxDepth(aTree.right, d + 1);
	}
}
