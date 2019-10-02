package maths_prob;

import java.util.ArrayList;

public class RearrangeArray {
	public void arrange(ArrayList<Integer> a) {
		int l = a.size();
		for (int i = 0; i < l; i++) {
			a.set(i, a.get(i) + (a.get(a.get(i)) % l) * l);
		}
		for (int i = 0; i < l; i++) {
			a.set(i, (a.get(i) / l));
		}
	}
}
