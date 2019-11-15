package binary_search_prob;

import java.util.Arrays;

public class AllocateBook {
	public int books(int[] arr, int stCount) {
		if (arr.length < stCount) {
			return -1;
		}
		int low = Arrays.stream(arr).max().getAsInt();
		int high = Arrays.stream(arr).sum();
		int ans = 0, mid, a;
		while (low <= high) {
			mid = (low + high) / 2;
			a = this.findAllocationCount(arr, mid);
//			System.out.println(mid+"->"+a);
			if (a <= stCount) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	public int findAllocationCount(int[] arr, int mid) {
		int t = 0, count = 1;
		for (int i = 0; i < arr.length; i++) {
			t += arr[i];
			if (t > mid) {
				++count;
				t = arr[i];
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[]= {12, 34, 67, 90};
		int b = 2;
		System.out.println(new AllocateBook().books(arr,b));
	}

}
