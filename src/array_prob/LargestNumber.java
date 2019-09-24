package array_prob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {
	public String largestNumber(final List<Integer> A) {

		Collections.sort(A, new Comparator<Integer>() {

			@Override
			public int compare(Integer a1, Integer a2) {
				return (a1 + "" + a2).compareTo(a2 + "" + a1);
			}
		});
		StringBuilder sb = new StringBuilder("");
		boolean isZero = true;
		for (int i = A.size() - 1; i >= 0; i--) {
			if (A.get(i) != 0)
				isZero = false;
			sb.append(A.get(i).toString());
		}
		return isZero ? "0" : sb.toString();
	}

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(0);
		arr.add(0);
		arr.add(0);
		System.out.println(new LargestNumber().largestNumber(arr));
	}

}
