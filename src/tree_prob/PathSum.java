package tree_prob;

public class PathSum {
	/*
	 * https://www.interviewbit.com/problems/path-sum/
	 */
	public int hasPathSum(TreeNode node, int s) {
		if (node == null)
			return 0;
		if (node.val == s && node.left == null && node.right == null)
			return 1;
		return this.hasPathSum(node.left, s - node.val) == 1 || this.hasPathSum(node.right, s - node.val) == 1 ? 1 : 0;
	}

}
