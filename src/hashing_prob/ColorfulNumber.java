package hashing_prob;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ColorfulNumber {
	public int colorful(int n) {
		Set<Long> set = new HashSet<>();
		ArrayList<Integer> lst = new ArrayList<>();
		while (n != 0) {
			int x = n % 10;
			lst.add(x);
			n /= 10;
		}
		for (int i = 0; i < lst.size(); i++) {
			long product = 1;
			for (int j = i; j < lst.size(); j++) {
				product = product * lst.get(j);
				if (set.contains(product))
					return 0;
				set.add(product);
			}
		}
		return 1;
	}
}
