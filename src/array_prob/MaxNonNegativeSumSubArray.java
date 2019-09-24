package array_prob;

import java.util.*;

public class MaxNonNegativeSumSubArray {
	public ArrayList<Integer> maxset(ArrayList<Integer> A) {
		ArrayList<Integer> ans = new ArrayList<>();
		ArrayList<Integer> copy = new ArrayList<>();
		long sum = 0;
		long temp = 0;

		for (int num : A) {
			if (num >= 0) {
				temp += num;
				copy.add(num);
			} else {
				temp = 0;
				copy.clear();
			}

			if (temp > sum || (temp == sum && ans.size() < copy.size())) {
				sum = temp;
				ans.clear();
				ans.addAll(copy);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Integer[] intArray = new Integer[] { 1, 2, 5, -7, 2, 5 };
//		Integer[] intArray = new Integer[] { 1967513926, 1540383426, -1303455736, -521595368 };
//		Integer[] intArray = new Integer[] { 756898537, -1973594324, -2038664370, -184803526, 1424268980 };
		ArrayList<Integer> arr = new ArrayList<Integer>((Arrays.asList(intArray)));
		System.out.println(new MaxNonNegativeSumSubArray().maxset(arr));
	}
}