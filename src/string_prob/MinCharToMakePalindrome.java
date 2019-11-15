package string_prob;

public class MinCharToMakePalindrome {
	public int solve(String str) {
		StringBuilder s = new StringBuilder(str);
		String rev = s.reverse().toString();
		StringBuilder dStr = new StringBuilder(str);
		dStr.append("$").append(rev);
		int n = dStr.length();
		int lps[] = new int[n];
		int i = 1, len = 0;
		lps[0] = 0;
		while (i < n) {
			if (dStr.charAt(i) == dStr.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			} else {
				if (len != 0) {
					len = lps[len - 1];
				} else {
					lps[i] = 0;
					i++;
				}
			}
		}
		return str.length() - lps[dStr.length() - 1];
	}

	public static void main(String[] args) {
		System.out.println(new MinCharToMakePalindrome().solve("AACECAAAA"));
	}

}
