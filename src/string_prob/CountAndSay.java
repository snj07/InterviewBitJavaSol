package string_prob;

public class CountAndSay {
	/*
	 * https://www.interviewbit.com/problems/count-and-say/
	 */
	public String countAndSay(int a) {
		String ans = "1";
		for (int i = 1; i < a; i++) {
			String s = "";
			int l = ans.length();
			int x = 1;
			int count = 1;
			char c = ans.charAt(0);
			while (x < l) {
				if (c != ans.charAt(x)) {
					s += count + "" + c;
					c = ans.charAt(x);
					count = 0;
				}
				++count;
				++x;
			}
			s += count + "" + c;
			ans = s;
		}
		return ans;
	}
}
