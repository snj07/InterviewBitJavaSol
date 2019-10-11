package maths_prob;

public class ExcelColNumber {
	public int titleToNumber(String str) {
		int x = 0;
		int l = str.length();
		for (int i = 0; i < l; i++) {
			x += (((int) (Math.pow(26, i))) * (str.charAt(l - 1 - i) - 64));
		}
		return x;
	}
}
