package maths_prob;

import java.util.ArrayList;
/*
 * https://www.interviewbit.com/problems/all-factors/
 */
public class FindAllFactors {
	public ArrayList<Integer> allFactors(int A) {
		int r = (int) (Math.sqrt(A));
		ArrayList<Integer> ansList = new ArrayList<>();
		ArrayList<Integer> shortList = new ArrayList<>();

		for (int i = 1; i <= r; i++) {
			if (A % i == 0) {
				if (A / i == i)
					ansList.add(i);
				else {
					ansList.add(i);
					shortList.add(A / i);
				}
			}
		}
		for (int i = shortList.size() - 1; i >= 0; i--) {
			ansList.add(shortList.get(i));
		}
		return ansList;
	}
}
