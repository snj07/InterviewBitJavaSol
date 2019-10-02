package maths_prob;

public class GreatestCommonDivisor {
	public int gcd(int a, int b) {
		int t;
		while (a != 0) {
			t = b;
			b = a;
			a = t % a;
		}
		return b;
	}
}
