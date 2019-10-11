package binary_search_prob;

import java.util.Arrays;

public class MatrixMedian {
	public int findMedian(int[][] mx) {
		int max = mx[0][0], min = mx[0][0];
		int r = mx.length, c = mx[0].length;
		for (int i = 0; i < r; i++) {
			if (mx[i][0] < min)
				min = mx[i][0];
			if (mx[i][c - 1] > max)
				max = mx[i][c - 1];
		}
		int t = (r * c + 1) / 2, mid, smallerElemCount, total;
		while (min < max) {
			total = 0;
			smallerElemCount = 0;
			mid = (max + min) / 2;
			for (int i = 0; i < r; i++) {
				smallerElemCount = Arrays.binarySearch(mx[i], mid);
				// returns -(insertion point + 1 )
				if (smallerElemCount < 0) {
					smallerElemCount = Math.abs(smallerElemCount) - 1;
				} else {
					while (smallerElemCount < c && mid == mx[i][smallerElemCount])
						smallerElemCount++;
				}
				total += smallerElemCount;
			}
			if (total < t) {
				min = mid + 1;
			} else {
				max = mid;
			}

		}
		return min;
	}

	public static void main(String[] args) {
	}

}
