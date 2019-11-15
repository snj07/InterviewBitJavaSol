package string_prob;

/*
 * https://www.interviewbit.com/problems/palindrome-string/
 */
public class PalindromeString {
	public int isPalindrome(String str) {
		String aString = str.toUpperCase();
		int x = 0, y = aString.length() - 1;
		while (x <= y) {
			if (aString.charAt(x) == aString.charAt(y)) {
				x++;
				y--;
				continue;
			} else if (aString.charAt(x) >= '0' && aString.charAt(x) <= '9'
					|| aString.charAt(x) >= 'y' && aString.charAt(y) <= '9') {
				return 0;
			} else if (aString.charAt(x) < 'A' || aString.charAt(x) > 'Z') {
				x++;
			} else if (aString.charAt(y) < 'A' || aString.charAt(y) > 'Z') {
				y--;
			} else {
				return 0;
			}
		}
		return 1;
	}
}
