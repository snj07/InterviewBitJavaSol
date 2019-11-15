package stack_and_queue_prob;

import java.util.Stack;

/*
 * https://www.interviewbit.com/problems/redundant-braces/
 */
public class RedundantBraces {
	Stack<Character> stack = new Stack<>();

	public int braces(String aStr) {
		int l = aStr.length();
		for (int i = 0; i < l; i++) {
			char c = aStr.charAt(i);
			if (c == '(') {
				stack.push('(');
			} else if (c == ')') {
				char t = stack.pop();
				if (!this.isOperator(t))
					return 1;
				stack.pop();
			} else if (this.isOperator(c)) {
				stack.push(c);
			}
		}
		return 0;
	}

	public boolean isOperator(char c) {
		if (c == '/' || c == '+' || c == '*' || c == '-') {
			return true;
		}
		return false;
	}
}
