package backtracking_prob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
 * https://www.interviewbit.com/problems/combination-sum/
 */
public class CombinationSum {
	public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> aList, int sum) {
		ArrayList<ArrayList<Integer>> ansList = new ArrayList<>();
		Set<Integer> st = new HashSet<>(aList);
		aList = new ArrayList<>(st);
		Collections.sort(aList);
		this.findCombinations(aList, new ArrayList<Integer>(), sum, 0, 0, ansList);
		return ansList;
	}

	public void findCombinations(ArrayList<Integer> aList, ArrayList<Integer> cList, int sum, int cSum, int index,
			ArrayList<ArrayList<Integer>> ansList) {
		ArrayList<Integer> newList = new ArrayList<>(cList);
		if (cSum > sum)
			return;
		if (cSum == sum) {
			ansList.add(newList);
			return;
		}
		for (int i = index; i < aList.size(); i++) {
			newList.add(aList.get(i));
			cSum += aList.get(i);
			this.findCombinations(aList, newList, sum, cSum, i, ansList);
			cSum -= aList.get(i);
			newList.remove(newList.size() - 1);
		}
	}

	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 8, 10, 6, 11, 1, 16, 8 };
		System.out.println(new CombinationSum().combinationSum(new ArrayList<Integer>((Arrays.asList(arr))), 7));
	}

}
