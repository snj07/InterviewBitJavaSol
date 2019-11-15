package tree_prob;

public class MinDepthOfBinaryTree {
	int min = 0;

	public int minDepth(TreeNode aTree) {
		this.min = 0;
		this.calMinDepth(aTree, 0);
		return this.min;
	}

	public void calMinDepth(TreeNode aTree, int d) {
		if (aTree == null)
			return;
		if (aTree.left == null && aTree.right == null) {
			d += 1;
			if (this.min > d || this.min == 0)
				this.min = d;
			return;
		}
		this.calMinDepth(aTree.left, d + 1);
		this.calMinDepth(aTree.right, d + 1);
	}
}
