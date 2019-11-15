package string_prob;

import java.util.ArrayList;

/*
 * https://www.interviewbit.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {
	public String longestCommonPrefix(ArrayList<String> arr) {
		StringBuilder sb = new StringBuilder();
		int s = arr.size();
		int x = 0;
		int l = arr.get(0).length();
		while (x < l) {
			char c = arr.get(0).charAt(x);
			for (int i = 1; i < s; i++) {
				String st = arr.get(i);
				if (st.length() == x || st.charAt(x) != c) {
					return sb.toString();
				}
			}
			x++;
			sb.append(c + "");
		}
		return sb.toString();
	}

}
