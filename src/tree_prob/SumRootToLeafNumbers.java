package tree_prob;

public class SumRootToLeafNumbers {
	public int sumNumbers(TreeNode aTree) {
		return this.calAns(aTree, 0);
	}

	public int calAns(TreeNode node, int s) {
		if (node == null) {
			return 0;
		}
		s = ((s * 10) % 1003 + node.val % 1003) % 1003;
		if (node.left == null && node.right == null)
			return s;

		return ((this.calAns(node.left, s) % 1003) + (this.calAns(node.right, s) % 1003)) % 1003;
	}
}
