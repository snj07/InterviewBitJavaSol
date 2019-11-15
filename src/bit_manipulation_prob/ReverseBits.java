package bit_manipulation_prob;

public class ReverseBits {
	public long reverse(long a) {
		long ans = 0;
		for (int i = 0; i < 32; i++) {
			ans = ans << 1;
			ans |= (a & 1);
			a = a >>> 1;
		}
		return ans;
	}
}
