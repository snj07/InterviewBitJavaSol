package array_prob;

import java.util.*;

public class RepeatAndMissingNumber {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public ArrayList<Integer> repeatedNumber(final List<Integer> arr) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int n = arr.size();
		long sumOfNum = (((long) n) * ((long) n + 1)) / 2;
		long sumOfSqr = (((long) n) * ((long) n + 1) * ((long) 2 * n + 1)) / 6;

		for (int i = 0; i < n; i++) {
			sumOfNum -= (long) arr.get(i);
		}

		for (int i = 0; i < n; i++) {
			sumOfSqr -= (long) arr.get(i) * (long) arr.get(i);
		}

		long sumNum = sumOfSqr / sumOfNum;

		int missingN = (int) (sumNum + sumOfNum) / 2;
		int repeatedN = (int) (sumNum - missingN);

		ans.add(repeatedN);
		ans.add(missingN);

		return ans;
	}
}
