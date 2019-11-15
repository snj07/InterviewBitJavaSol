package maths_prob;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * https://www.interviewbit.com/problems/rearrange-array/
 */
public class RearrangeArray {
	public void arrange(ArrayList<Integer> a) {
		int l = a.size();
		for (int i = 0; i < l; i++) {
			a.set(i, a.get(i) + (a.get(a.get(i))%l) * l);
		}
		System.out.println(a);
		for (int i = 0; i < l; i++) {
			a.set(i, (a.get(i) / l));
		}
		System.out.println(a);
	}

	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 4, 0, 2, 1, 3 };
		new RearrangeArray().arrange(new ArrayList<Integer>((Arrays.asList(arr))));

	}
}
