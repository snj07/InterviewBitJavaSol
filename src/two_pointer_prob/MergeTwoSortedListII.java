package two_pointer_prob;

import java.util.ArrayList;

/*
 * https://www.interviewbit.com/problems/merge-two-sorted-lists-ii/
 */
public class MergeTwoSortedListII {
	public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
		int x = 0, y = b.size() - 1;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > b.get(x)) {
				a.add(i, b.get(x));
				++x;
			}
			if (x > y)
				break;
		}
		while (x <= y) {
			a.add(b.get(x++));
		}
	}

}
