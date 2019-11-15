package backtracking_prob;

import java.util.ArrayList;

public class Combinations {
	public ArrayList<ArrayList<Integer>> combine(int n, int k) {
		ArrayList<ArrayList<Integer>> ansList = new ArrayList<>();
		this.createCombinations(n, k, 1, new ArrayList<Integer>(), ansList);
		return ansList;
	}

	public void createCombinations(int n, int k, int c, ArrayList<Integer> arrList,
			ArrayList<ArrayList<Integer>> ansList) {
		ArrayList<Integer> newList = new ArrayList<>(arrList);
		if (newList.size() > k)
			return;
		if (newList.size() == k) {
			ansList.add(newList);
			return;
		}
		for (int i = c; i <= n; i++) {
			newList.add(i);
			this.createCombinations(n, k, i + 1, newList, ansList);
			newList.remove(newList.size() - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(new Combinations().combine(4, 2));
	}
}
