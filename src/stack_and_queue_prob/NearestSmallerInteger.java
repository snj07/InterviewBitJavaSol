package stack_and_queue_prob;

import java.util.ArrayList;
import java.util.Stack;

/*
 * https://www.interviewbit.com/problems/nearest-smaller-element/
 */
public class NearestSmallerInteger {
	public ArrayList<Integer> prevSmaller(ArrayList<Integer> aList) {
		ArrayList<Integer> ansList = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < aList.size(); i++) {
			while (!stack.empty() && stack.peek() >= aList.get(i)) {
				stack.pop();
			}
			if (stack.empty()) {
				ansList.add(-1);
			} else {
				ansList.add(stack.peek());
			}
			stack.push(aList.get(i));
		}
		return ansList;
	}

}
