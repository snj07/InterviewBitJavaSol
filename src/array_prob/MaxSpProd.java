package array_prob;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxSpProd {
	int maxSpecialProduct(ArrayList<Integer> list) {
		int s = list.size();
		
		long spLProduct = 0;
		for (int i = 1; i < s - 1; i++) {
			int leftSpIx = Integer.MIN_VALUE;
			boolean flag1 = false, flag2 = false;
			for (int j = i; j >= 0; j--) {
				if (list.get(i) < list.get(j) && j > leftSpIx) {
					leftSpIx = j;
					flag1 = true;
				}

			}
			int rightSpIx = Integer.MAX_VALUE;
			for (int j = i; j < s; j++) {
				if (list.get(i) < list.get(j) && j < rightSpIx) {
					rightSpIx = j;
					flag2 = true;
				}
			}
			long splProductT = (long) leftSpIx * (long) rightSpIx * (flag1 && flag2 ? 1 : 0);
			spLProduct = Math.max(spLProduct, splProductT);
		}

		return (int) (spLProduct % 1000000007);
	}

	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 5, 9, 6, 8, 6, 4, 6, 9, 5, 4, 9 };
		System.out.println(new MaxSpProd().maxSpecialProduct(new ArrayList<Integer>((Arrays.asList(arr)))));
	}
}
