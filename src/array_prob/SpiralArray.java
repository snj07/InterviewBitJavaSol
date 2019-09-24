package array_prob;

import java.util.ArrayList;
import java.util.Arrays;

public class SpiralArray {
	public ArrayList<ArrayList<Integer>> generateMatrix(int n) {
        Integer arr[][] = new Integer[n][n];
        int x = 1;
        for (int i = 0; i < n / 2+1; i++) {
            for (int j = i; j < n - i; j++) {
                arr[i][j] = x++;
            }
            for (int j = i + 1; j < n - i; j++) {
                arr[j][n - i - 1] = x++;
            }
            for (int j = n - i - 2; j >= i; j--) {
                arr[n - i - 1][j] = x++;
            }
            for (int j = n - i - 2; j > i; j--) {
                arr[j][i] = x++;
            }
        }
        ArrayList<ArrayList<Integer>> arrayList2D = new ArrayList<>(arr.length);
        for (Integer[] record : arr) {
            arrayList2D.add(new ArrayList<Integer>(Arrays.asList(record)));
        }

        return arrayList2D;
    }

	public static void main(String[] args) {
//		System.out.println(Arrays.deepToString(new SpiralArray().generateMatrix(10)).replace("], ", "]\n"));
		System.out.println(toString(new SpiralArray().generateMatrix(21)));
	}

	public static String toString(ArrayList<ArrayList<Integer>> myBoard) {
		String result = "";
		for (int i = 0; i < myBoard.size(); i++) {
			for (int j = 0; j < myBoard.get(i).size(); j++) {
				result += myBoard.get(i).get(j)+"      ";
			}
			// System.out.println();
			result += "\n";
		}
		return result;
	}
}
