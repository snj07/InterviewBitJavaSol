package maths_prob;

import java.util.ArrayList;
/*
 * https://www.interviewbit.com/problems/prime-numbers/
 * https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
 */
public class PrimeNumbers {
	public ArrayList<Integer> sieve(int n) {
		// default value is false
		boolean[] primeArr = new boolean[n + 1];
		ArrayList<Integer> ansList = new ArrayList<Integer>();
		for (int i = 2; i * i <= n; i++) {
			for (int j = i * i; j <= n; j += i) {
				primeArr[j] = true;
			}
		}
		for (int i = 2; i <= n; i++) {
			if (!primeArr[i])
				ansList.add(i);
		}
		return ansList;
	}

}
