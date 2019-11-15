package bit_manipulation_prob;

import java.util.ArrayList;
import java.util.Collections;

public class MinXorValue {
	public int findMinXor(ArrayList<Integer> arr) {
		Collections.sort(arr);
		int min = Integer.MAX_VALUE, l = arr.size();
		for (int i = 0; i < l - 1; i++) {
			int t = arr.get(i) ^ arr.get(i + 1);
			if (t < min)
				min = t;
		}
		return min;
	}

}
