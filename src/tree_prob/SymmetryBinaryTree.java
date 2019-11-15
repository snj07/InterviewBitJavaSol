package tree_prob;

/*
 * https://www.interviewbit.com/problems/symmetric-binary-tree/
 */
public class SymmetryBinaryTree {
	public int isSymmetric(TreeNode aTree) {
		if (aTree == null)
			return 1;
		return this.isSame(aTree.left, aTree.right);
	}

	public int isSame(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null)
			return 1;
		else if (t1 == null || t2 == null)
			return 0;
		if (t1.val == t2.val && this.isSame(t1.left, t2.right) == 1 && this.isSame(t2.right, t1.left) == 1)
			return 1;
		return 0;
	}
}
