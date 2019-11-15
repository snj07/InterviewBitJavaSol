package two_pointer_prob;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
	public int removeDuplicates(ArrayList<Integer> a) {
		int x = 1;
		while (x < a.size()) {
			if (a.get(x - 1).equals(a.get(x))) {
				a.remove(x);
			} else {
				x++;
			}

		}
		return a.size();
	}

	public static void main(String[] args) {
		Integer arr1[] = { 5000, 5000, 5000 };
		ArrayList<Integer> ss = new ArrayList<Integer>(Arrays.asList(arr1));
		System.out.println(new RemoveDuplicateFromSortedArray().removeDuplicates(ss));
		System.out.println(ss);
	}
}
