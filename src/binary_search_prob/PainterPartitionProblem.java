package binary_search_prob;

import java.util.ArrayList;
import java.util.Arrays;
/*
 * https://www.interviewbit.com/problems/painters-partition-problem/
 */

public class PainterPartitionProblem {
	public int paint(int k, int t, int[] arr) {
		long lo = Arrays.stream(arr).max().getAsInt();
		long hi = Arrays.stream(arr).sum();
		long ans = 0;
		while (lo <= hi) {
			long mid = (lo + (long) hi) / 2L;
			int painters = this.findPainter(arr, mid);
			if (painters <= k) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return (int) ((ans * t) % 10000003);
	}

	public int findPainter(int[] arr, long c) {
		long s = 0;
		int painters = 1;
		for (int i = 0; i < arr.length; i++) {
			s += arr[i];
			if (s > c) {
				s = arr[i];
				++painters;
			}
		}
		return painters;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 10 };
//		Integer arrX[] = { 1, 10 };
		System.out.println(new PainterPartitionProblem().paint(2, 5, arr));
//		System.out.println(new PainterPartitionProblem().paint(2, 5, new ArrayList<Integer>(Arrays.asList(arrX))));
		int arr2[] = { 1 };
		System.out.println(new PainterPartitionProblem().paint(1, 10, arr2));
		int arr3[] = { 1000000, 1000000 };
		System.out.println(new PainterPartitionProblem().paint(1, 1000000, arr3));
//		System.out.println(partition(arr, 2, 2)); 
	}

}
