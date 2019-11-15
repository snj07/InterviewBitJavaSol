package hashing_prob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * https://www.interviewbit.com/problems/2-sum/
 */
public class TwoSum {
	public ArrayList<Integer> twoSum(final List<Integer> aList, int t) {
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> ansList = new ArrayList<>();
		for (int i = 0; i < aList.size(); i++) {
			int s = t - aList.get(i);
			if (map.containsKey(s)) {
				ansList.add(map.get(s) + 1);
				ansList.add(i + 1);
				break;
			}
			if (!map.containsKey(aList.get(i)))
				map.put(aList.get(i), i);
		}
		return ansList;
	}

}
