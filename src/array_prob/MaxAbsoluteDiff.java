package array_prob;

import java.util.ArrayList;

public class MaxAbsoluteDiff {
	public int maxArr(ArrayList<Integer> A) {
		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
		for (int i = 0; i < A.size(); i++) {
			max1 = Math.max(max1, A.get(i) + (i + 1));
			min1 = Math.min(min1, A.get(i) + (i + 1));
			max2 = Math.max(max2, A.get(i) - (i + 1));
			min2 = Math.min(min2, A.get(i) - (i + 1));
		}
		return Math.max(max1 - min1, max2 - min2);
	}
}
