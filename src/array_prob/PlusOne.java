package array_prob;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {

	public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		int n, c = 1;
		for (int i = A.size() - 1; i >= 0; i--) {
			n = A.get(i) + c;
			if (n >= 10) {
				c = n % 10;
				A.set(i, c);
				c = 1;
			} else if (c != 0) {
				A.set(i, n);
				c = 0;
			} else {
				c = 0;
			}
		}

		if (c != 0) {
			A.add(0, 1);
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int i = 0;
		for (; i < A.size(); i++) {
			if (A.get(i) == 0) {
				continue;
			}
			break;
		}
		for (; i < A.size(); i++) {
			ans.add(A.get(i));
		}
		return ans;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arrA = new ArrayList<Integer>(Arrays.asList(0, 3, 7, 6, 4, 0, 5, 5, 5));
		System.out.println(plusOne(arrA));
	}
}
