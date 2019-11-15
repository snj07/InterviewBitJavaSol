package tree_prob;

import java.util.ArrayList;

/*
 * https://www.interviewbit.com/problems/root-to-leaf-paths-with-sum/
 */
public class RootToLeafPathsWithSum {
	public ArrayList<ArrayList<Integer>> pathSum(TreeNode node, int s) {
		ArrayList<ArrayList<Integer>> pathList = new ArrayList<>();
		ArrayList<Integer> cList = new ArrayList<>();
		this.calPathSum(pathList, cList, node, s);
		return pathList;
	}

	public void calPathSum(ArrayList<ArrayList<Integer>> pathList, ArrayList<Integer> cList, TreeNode node, int s) {
		if (node == null) {
			return;
		}
		if (node.val == s && node.left == null && node.right == null) {
			cList.add(node.val);
			pathList.add(new ArrayList<>(cList));
			cList.remove(cList.size() - 1);
		}
		cList.add(node.val);
		calPathSum(pathList, cList, node.left, s - node.val);
		calPathSum(pathList, cList, node.right, s - node.val);
		cList.remove(cList.size() - 1);
	}
}
