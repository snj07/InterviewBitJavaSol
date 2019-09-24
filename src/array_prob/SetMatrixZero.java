package array_prob;

import java.util.ArrayList;

public class SetMatrixZero {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
		int x = a.size();
		boolean rowFlag = false;
		boolean colFlag = false;
		for (int i = 0; i < x; i++) {
			ArrayList<Integer> aList = a.get(i);
			int s = aList.size();
			for (int j = 0; j < s; j++) {
				if (i == 0 && aList.get(j) == 0) {
					rowFlag = true;
				}
				if (j == 0 && aList.get(j) == 0) {
					colFlag = true;
				}
				if (aList.get(j) == 0) {
					a.get(0).set(j, 0);
					a.get(i).set(0, 0);
				}
			}
		}
		for (int i = 1; i < x; i++) {
			ArrayList<Integer> aList = a.get(i);
			int s = aList.size();
			for (int j = 1; j < s; j++) {
				if (a.get(0).get(j) == 0 || a.get(i).get(0) == 0) {
					aList.set(j, 0);
				}
			}
		}
		if (rowFlag) {
			ArrayList<Integer> aList = a.get(0);
			int s = aList.size();
			for (int j = 0; j < s; j++) {
				aList.set(j, 0);
			}
		}
		if (colFlag) {
			int s = a.size();
			for (int j = 0; j < s; j++) {
				a.get(j).set(0, 0);
			}
		}
	}
}
