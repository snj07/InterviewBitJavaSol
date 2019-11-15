package binary_search_prob;

import java.util.List;

public class RotatedSortedArraySearch {
	public class Solution {
		// DO NOT MODIFY THE LIST
		public int search(final List<Integer> a, int b) {
			return findElementIndex(a, 0, a.size() - 1, b);
		}

		public int findElementIndex(List<Integer> arr, int l, int h, int k) {

			if (l > h) {
				return -1;
			}
			int mid = (l + h) / 2;
			if (arr.get(mid) == k) {
				return mid;
			}
			// l to mid is sorted
			if (arr.get(l) <= arr.get(mid)) {
				// element is between l and mid
				if (k >= arr.get(l) && k <= arr.get(mid)) {
					return this.findElementIndex(arr, l, mid - 1, k);
				}
				// element is not between l and mid
				return this.findElementIndex(arr, mid + 1, h, k);
			}
			// mid to h is sorted and array is between mid and h
			if (k >= arr.get(mid) && k <= arr.get(h))
				return this.findElementIndex(arr, mid + 1, h, k);
			return this.findElementIndex(arr, l, mid - 1, k);
		}
	}

}
