package hashing_prob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Equal {
	class Pair {
		int a, b;

		Pair(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}

	public ArrayList<Integer> equal(ArrayList<Integer> aList) {
		Map<Integer, Pair> map = new HashMap<>();
		int s = aList.size();
		ArrayList<Integer> ansList = new ArrayList<>();
		for (int i = 0; i < s - 1; i++) {
			for (int j = i + 1; j < s; j++) {
				int sum = aList.get(i) + aList.get(j);
				if (!map.containsKey(sum)) {
					map.put(sum, new Pair(i, j));
				} else {
					Pair p = map.get(sum);
					int a1 = p.a, b1 = p.b, c1 = i, d1 = j;
					if (a1 < b1 && c1 < d1 && a1 < c1 && b1 != d1 && b1 != c1) {
						ansList = this.compareList(ansList, new ArrayList<Integer>(Arrays.asList(a1, b1, c1, d1)));
					}
				}
			}
		}
		return ansList;
	}

	public ArrayList<Integer> compareList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		if (list1.size() == 0)
			return list2;
		int a1 = list1.get(0), b1 = list1.get(1), c1 = list1.get(2), d1 = list1.get(3);
		int a2 = list2.get(0), b2 = list2.get(1), c2 = list2.get(2), d2 = list2.get(3);
		if (a1 < a2 || a1 == a2 && b1 < b2 || a1 == a2 && b1 == b2 && c1 < c2
				|| a1 == a2 && b1 == b2 && c1 == c2 && d1 < d2)
			return list1;
		return list2;
	}

	public static void main(String[] args) {
		System.out.println(new Equal().equal(new ArrayList<Integer>(Arrays.asList(new Integer[] { 1, 1, 1, 1, 1 }))));

	}
}
