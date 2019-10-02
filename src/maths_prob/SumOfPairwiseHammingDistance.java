package maths_prob;

import java.util.List;

/*
 * https://www.interviewbit.com/problems/sum-of-pairwise-hamming-distance/
 */
public class SumOfPairwiseHammingDistance {
	public int hammingDistance(final List<Integer> aList) {
		long ans = 0;
		long size = aList.size();
		for (int i = 0; i < 32; i++) {
			long c = 0;
			for (Integer x : aList) {
				if ((x & (1 << i)) != 0)
					c++;
			}
			ans += (c * (size - c) * 2);
			ans = ans % 1000000007;
		}
		return (int) (ans);
	}
}
