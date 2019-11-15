package tree_prob;

/*
 * https://www.interviewbit.com/problems/identical-binary-trees/
 */
public class IdenticalBinaryTree {
	public int isSameTree(TreeNode aTree, TreeNode bTree) {
		if (aTree == null && bTree == null)
			return 1;
		else if (aTree == null || bTree == null)
			return 0;

		if (aTree.val == bTree.val && this.isSameTree(aTree.left, bTree.left) == 1
				&& this.isSameTree(aTree.right, bTree.right) == 1)
			return 1;
		return 0;
	}

}
