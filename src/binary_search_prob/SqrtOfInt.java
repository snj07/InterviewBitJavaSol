package binary_search_prob;

public class SqrtOfInt {
	public int sqrt(int a) {
		if (a == 0 || a == 1)
			return a;
		long start = 1, end = a;
		int ans = 0;
		long mid, sq;
		while (start <= end) {
			mid = (start + end) / 2;
			sq = (long) mid * (long) mid;
			if (sq == a)
				return (int) mid;
			else if (sq < a) {
				// consider floor as answer
				ans = (int) mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(new SqrtOfInt().sqrt(2147483647));
	}
}
