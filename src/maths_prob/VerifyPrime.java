package maths_prob;

public class VerifyPrime {
	public int isPrime(int n) {
		if (n <= 1)
			return 0;
		if (n <= 3)
			return 1;
		if (n % 2 == 0 || n % 3 == 0)
			return 0;
		int l = (int) (Math.sqrt(n));
		for (int i = 5; i <= l; i += 6) {
			if (n % i == 0 || n % (i + 2) == 0)
				return 0;
		}
		return 1;
	}
}