package array_prob;

import java.util.*;

public class HotelBookPossible {
	public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
		Collections.sort(arrive);
		Collections.sort(depart);

		int arrivalIx = 0, departIx = 0, count = 0;
		int len = arrive.size();
		while (arrivalIx < len && departIx < len) {
			if (arrive.get(arrivalIx) < depart.get(departIx)) {
				count++;
				arrivalIx++;
				if (count > K)
					return false;
			} else {
				count--;
				departIx++;
			}
		}
		return true;
	}
}