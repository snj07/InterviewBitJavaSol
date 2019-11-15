package stack_and_queue_prob;

import java.util.Stack;

/*
 * https://www.interviewbit.com/problems/simplify-directory-path/
 */
public class SimplifyDirPath {

	Stack<String> sk = new Stack<>();

	public String simplifyPath(String a) {
		sk.clear();
		int l = a.length();
		String s = "";
		for (int i = 0; i < l; i++) {
			char c = a.charAt(i);
			if (c == '/') {
				this.checkChar(c, s);
				s = "";
			} else {
				s += c + "";
			}
		}
		if (s != "") {
			this.checkChar('/', s);
		}
		StringBuilder ans = new StringBuilder("");
		while (!sk.empty()) {
			ans.insert(0, "/" + sk.pop());
		}
		return ans.length() > 0 ? ans.toString() : "/";
	}

	public void checkChar(char c, String s) {
		if (s.equals("..")) {
			if (!sk.empty())
				sk.pop();
		} else if (s.equals(".")) {

		} else if (!s.equals("")) {
			sk.push(s);
		}
	}
}
