package array_prob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class SimpleQueries {

	ArrayList<Integer> gArray = new ArrayList<>();
	int cMax = Integer.MIN_VALUE;
	HashMap<Integer, Long> divisorPro = new HashMap<>();

	long findDivisorProduct(int n) {
		long ans = 1;
		if (divisorPro.containsKey(n))
			return divisorPro.get(n);
		for (int i = 1; i <= Math.sqrt(n); i++) {
			// If divisors are equal, print only one
			if (n % i == 0) {
				if (n / i == i) {
					ans *= i;
				} else {
					ans *= n;
				}
			}
		}
		divisorPro.put(n, ans);
		return ans;
	}

	void findSubArrays(ArrayList<Integer> arr, int start, int end) {

		if (end == arr.size())
			return;
		if (start > end)
			findSubArrays(arr, 0, end + 1);
		else {
//			System.out.print("[");
			cMax = Integer.MIN_VALUE;
			for (int i = start; i <= end; i++) {
				if (arr.get(i) > this.cMax) {
					cMax = arr.get(i);
				}
//				System.out.print(arr.get(i) + ", ");
			}
			gArray.add(cMax);
//			System.out.println("]");
			findSubArrays(arr, start + 1, end);
		}
		return;
	}

	public ArrayList<Integer> solve(ArrayList<Integer> arrA, ArrayList<Integer> arrB) {
		this.gArray.clear();
		this.findSubArrays(arrA, 0, 0);
		printArr(this.gArray);
		int len = this.gArray.size();
		for (int i = 0; i < len; i++) {
			int x = (int) (this.findDivisorProduct(this.gArray.get(i)) % 1000000007);
			this.gArray.set(i, x);
		}
		printArr(this.gArray);
		Collections.sort(this.gArray, Collections.reverseOrder());
		ArrayList<Integer> ans = new ArrayList<>();
		printArr(gArray);
		int lenB = arrB.size();
		for (int i = 0; i < lenB; i++) {
			if (arrB.get(i) < len) {
				ans.add(this.gArray.get(arrB.get(i)));
			} else {
				ans.add(-1);
			}
		}
		printArr(ans);
		return ans;
	}

	public static void main(String[] args) {
		Integer arr[] = { 84, 64, 5, 6, 85, 55, 15, 81, 13, 61, 22, 20, 15, 69, 23, 10, 89, 9, 49, 67, 5, 85, 90, 36,
				79, 98, 10, 51, 64, 96, 28, 85, 35, 18, 9, 78, 79, 15, 94, 33, 1, 51, 39, 90, 93, 75, 75, 88, 77, 77,
				82, 21, 22, 60, 10, 2, 44, 92, 91, 73, 79, 77, 69, 88, 6 };
		Integer arrB[] = { 1947, 2015, 720, 513, 49, 481, 1900, 1871, 287, 657, 1839, 1095, 1547, 1398, 2058, 351, 1069,
				860, 1937, 1455, 48, 1841, 1435, 218, 1988 };
//		Integer arr[] = { 39, 99, 70, 24, 49, 13, 86, 43, 88, 74, 45, 92, 72, 71, 90, 32, 19, 76, 84, 46, 63, 15, 87, 1,
//				39, 58, 17, 65, 99, 43, 83, 29, 64, 67, 100, 14, 17, 100, 81, 26, 45, 40, 95, 94, 86, 2, 89, 57, 52, 91,
//				45 };
//		Integer arrB[] = { 1221, 360, 459, 651, 958, 584, 345, 181, 536, 116, 1310, 403, 669, 1044, 1281, 711, 222, 280,
//				1255, 257, 811, 409, 698, 74, 838 };
		new SimpleQueries().solve(new ArrayList<Integer>((Arrays.asList(arr))),
				new ArrayList<Integer>((Arrays.asList(arrB))));
//		ob.gArray.stream().forEach(System.out::println);
	}

	public void printArr(ArrayList<Integer> arr) {
		for (Integer a : arr) {
			System.out.print(a + "  ");
		}
		System.out.println();
	}

}
