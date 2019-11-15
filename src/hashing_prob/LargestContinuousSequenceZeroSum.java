package hashing_prob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * https://www.interviewbit.com/problems/largest-continuous-sequence-zero-sum/
 */
public class LargestContinuousSequenceZeroSum {
	public ArrayList<Integer> lszero(ArrayList<Integer> aList) {
		Map<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> ansList = new ArrayList<>();
		int s = 0, e = 0;
		int sum = 0, maxLen = 0;
		for (int i = 0; i < aList.size(); i++) {
			sum += aList.get(i);
			if (aList.get(i) == 0 && maxLen == 0) {
				s = e = i;
				maxLen++;
			} else if (sum == 0) {
				s = 0;
				e = i;
				maxLen = i + 1;
			}
			if (map.containsKey(sum)) {
				int t = i - map.get(sum);
				if (t > maxLen) {
					s = map.get(sum) + 1;
					e = i;
					maxLen = t;
				}
			} else {
				map.put(sum, i);
			}
		}
		if (maxLen != 0) {
			ansList.addAll(aList.subList(s, e + 1));
		}
		return ansList;
	}

}
