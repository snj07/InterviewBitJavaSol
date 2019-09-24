package array_prob;

import java.util.ArrayList;

class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}
}

public class MergeIntervals {
	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		int l = intervals.size();
		ArrayList<Interval> ans = new ArrayList<>();
		for (int i = 0; i < l; i++) {
			Interval it = intervals.get(i);
			if (it.end < newInterval.start) {
				ans.add(it);
			} else if (newInterval.end < it.start) {
				ans.add(newInterval);
				ans.addAll(intervals.subList(i, l));
				return ans;
			} else {
				int start = Math.min(newInterval.start, it.start);
				int end = Math.max(newInterval.end, it.end);
				newInterval.start = start;
				newInterval.end = end;
			}
		}
		ans.add(newInterval);
		return ans;
	}
}
