package array_prob;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Sanjay
 *
 */
public class MinStepsInInfiniteGrid {
	public static void main(String[] args) {
		ArrayList<Integer> arrA = new ArrayList<Integer>(
				Arrays.asList(-6, -1, -4, -2, 12, 3, 3, -2, 13, -14, 10, -2, 0, -11, 8, -9, -10));
		ArrayList<Integer> arrB = new ArrayList<Integer>(
				Arrays.asList(14, 0, -11, -6, -14, 2, -10, 0, -1, 6, 3, 3, 8, -10, 7, -3, 11));
		System.out.println(coverPoints(arrA, arrB));
	}

	/**
	 * @param listA
	 * @param listB
	 * @return steps to cover points
	 */
	public static int coverPoints(ArrayList<Integer> listA, ArrayList<Integer> listB) {
		int steps = 0, dx, dy;
		int len = listA.size();
		if (len <= 1)
			return 0;

		for (int i = 0; i < len-1; i++) {
			dx = Math.abs(listA.get(i) - listA.get(i + 1));
			dy = Math.abs(listB.get(i) - listB.get(i + 1));
			steps += Math.max(dx, dy);
		}
		return steps;
	}
}
