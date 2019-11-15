package binary_search_prob;

import java.util.ArrayList;
import java.util.List;

public class SerachForRange {
	public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
		int lo = 0, hi = a.size() - 1, s = a.size() - 1, mid;
		int a0 = -1, a1 = -1;
		while (lo <= hi) {
			mid = (lo + hi) / 2;
			if (a.get(mid) == b && (mid == 0 || a.get(mid - 1) < a.get(mid))) {
				a0 = mid;
				break;
			} else if (a.get(mid) < b) {
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		lo = 0;
		hi = s;
		while (lo <= hi) {
			mid = (lo + hi) / 2;
			if (a.get(mid) == b && (mid == s || a.get(mid + 1) > a.get(mid))) {
				a1 = mid;
				break;
			} else if (a.get(mid) <= b) {
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		final int a00 = a0, a11 = a1;
		return new ArrayList<Integer>() {
			{
				add(a00);
				add(a11);
			}
		};
	}

}
