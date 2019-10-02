package maths_prob;

import java.util.ArrayList;

public class NumberLessThanK {
	public int solve(ArrayList<Integer> aList, int b, int c) {

		int cSize = (int) Math.log10(c) + 1;
		int n = aList.size();
		boolean zero = false;
		int count = 0;

		if (cSize < b || n == 0) {
			return 0;
		}
		if (aList.get(0) == 0) {
			zero = true;
		}
		if (cSize > b) {
			if (b > 1 && zero) {
				return (n - 1) * ((int) Math.pow(n, b - 1));

			} else {
				return (int) Math.pow(n, b);
			}
		}

		int po = (int) Math.pow(10, b - 1);

		for (int i = b; i > 0; i--) {

			int t = c / po;
			int j = 0;
			c %= po;
			po /= 10;
			for (j = 0; j < n; j++) {
				if (aList.get(j) >= t) {
					break;
				}
			}

			count += (b > 1 && i == b && zero ? j - 1 : j) * (int) Math.pow(n, i - 1);
			if (j == n || aList.get(j) > t)
				break;
		}
		return count;
	}

}
