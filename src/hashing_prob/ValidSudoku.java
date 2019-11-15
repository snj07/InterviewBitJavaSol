package hashing_prob;

import java.util.Arrays;
import java.util.List;

public class ValidSudoku {
	public int isValidSudoku(final List<String> aBoard) {
        for (int i = 0; i < 9; i++) {
            boolean[] ix = new boolean[9];
            for (int j = 0; j < 9; j++) {
                char c = aBoard.get(i).charAt(j);
                if (c != '.') {
                    if (ix[c - '1'])
                        return 0;
                    ix[c - '1'] = true;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            boolean[] ix = new boolean[9];
            for (int j = 0; j < 9; j++) {
                char c = aBoard.get(j).charAt(i);
                if (c != '.') {
                    if (ix[c - '1'])
                        return 0;
                    ix[c - '1'] = true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (checkBlock(aBoard, i, j) == 0)
                    return 0;
            }
        }
        return 1;
    }

    int checkBlock(List<String> aBoard, int x, int y) {
        boolean[] ix = new boolean[9];
        for (int i = x * 3; i < x * 3 + 3; i++) {
            for (int j = y * 3; j < y * 3 + 3; j++) {
                char c = aBoard.get(i).charAt(j);
                if (c != '.') {
                    if (ix[c - '1'])
                        return 0;
                    ix[c - '1'] = true;
                }
            }
        }
        return 1;
    }

	public static void main(String[] args) {
		String[] arr = { "..4...63.", ".........", "5......9.", "...56....", "4.3.....1", "...7.....", "...5.....", ".........", "........." };
		System.out.println(new ValidSudoku().isValidSudoku(Arrays.asList(arr)));

	}

}
