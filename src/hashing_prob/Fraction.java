package hashing_prob;

import java.util.HashMap;
import java.util.Map;

/*
 * https://www.interviewbit.com/problems/fraction/
 */
public class Fraction {
	public String fractionToDecimal(int A, int B) {
		long num = A;
		long den = B;
		StringBuilder sb = new StringBuilder();
		if (den == 0)
			return "0";
		if (num < 0 && den > 0 || num > 0 && den < 0) {
			sb.append("-");
		}
		num = Math.abs(num);
		den = Math.abs(den);

		long t = num / den;
		sb.append(t + "");
		long rem = num % den;
		if (rem == 0) {
			return sb.toString();
		}
		sb.append(".");
		Map<Long, Integer> map = new HashMap<>();
		int index = 0;
		boolean isRepeat = false;
		while (rem != 0) {
			if (map.containsKey(rem)) {
				isRepeat = true;
				index = map.get(rem);
				break;
			} else {
				map.put(rem, sb.length());
			}
			rem *= 10;
			t = rem / den;
			sb.append(t + "");
			rem %= den;
		}
		if (isRepeat) {
			sb.append(")");
			sb.insert(index, "(");
		}
		return sb.toString();
	}
}
