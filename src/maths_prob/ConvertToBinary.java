package maths_prob;

public class ConvertToBinary {
	public String findDigitsInBinary(int a) {
		if (a == 0)
			return "0";
		StringBuilder sb = new StringBuilder();
		while (a != 0) {
			if (a % 2 == 0)
				sb.append("" + 0);
			else
				sb.append("" + 1);
			a /= 2;
		}
		return sb.reverse().toString();
	}
}
