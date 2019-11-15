package stack_and_queue_prob;

import java.util.ArrayList;
import java.util.Stack;

/*
 * https://www.interviewbit.com/problems/evaluate-expression/
 */
public class EvaluateExpression {
	public int evalRPN(ArrayList<String> aList) {
		Stack<String> stack = new Stack<>();
		for (String s : aList) {
			if (this.isOperator(s)) {
				int y = Integer.parseInt(stack.pop());
				int x = Integer.parseInt(stack.pop());
				stack.push(this.performOperation(x, y, s) + "");
			} else {
				stack.push(s);
			}
		}
		return Integer.parseInt(stack.pop());
	}

	public boolean isOperator(String s) {
		if (s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*"))
			return true;
		return false;
	}

	public int performOperation(int x, int y, String op) {
		switch (op) {
		case "+":
			return x + y;
		case "-":
			return x - y;
		case "*":
			return x * y;
		case "/":
			return x / y;
		}
		return -1;
	}

}
