package string_prob;

/*
 * https://www.interviewbit.com/problems/amazing-subarrays/
 */
public class AmazinSubArray {
	public int solve(String aStr) {
		String aString = aStr.toUpperCase();
		int l = aString.length();
		int count = 0;
		for (int i = 0; i < l; i++) {
			if (aString.charAt(i) == 'A' || aString.charAt(i) == 'E' || aString.charAt(i) == 'I'
					|| aString.charAt(i) == 'O' || aString.charAt(i) == 'U') {
				count += (l - i);
			}
		}
		return count % 10003;
	}
}
