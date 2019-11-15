package stack_and_queue_prob;

/*
 * https://www.interviewbit.com/problems/rain-water-trapped/
 */
import java.util.List;

public class RainWaterTrap {
	public int trap(final List<Integer> aList) {
		int result = 0;

		int start = 0, end = aList.size() - 1, current = 0;
		while (start < end) {
			if (aList.get(start) <= aList.get(end)) {
				current = aList.get(start);
				while (start < end && aList.get(++start) <= current)
					result += current - aList.get(start);
			} else {
				current = aList.get(end);
				while (aList.get(--end) < current)
					result += current - aList.get(end);
			}
		}
		return result;
	}

}
