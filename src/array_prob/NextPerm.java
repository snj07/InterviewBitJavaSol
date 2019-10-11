package array_prob;

import java.util.Arrays;

public class NextPerm {
	public int[] nextPermutation(int[] arr) {
		boolean isRevSorted = true;
		int len = arr.length;
		int t, x = -1, min;
		if (len < 1)
			return arr;

		for (int i = 0; i < len - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				isRevSorted = false;
				break;
			}
		}

		if (isRevSorted) {
			for (int i = 0; i < len / 2; i++) {
				t = arr[i];
				arr[i] = arr[len - 1 - i];
				arr[len - i - 1] = t;
			}
			return arr;
		}

		for (int i = len - 1; i > 0; i--) {
			if (arr[i - 1] < arr[i]) {
				x = i - 1;
				break;
			}
		}
		min = x + 1;
		for (int i = len - 1; i > x; i--) {
			if (arr[i] < arr[min] && arr[i] > arr[x]) {
				min = i;
			}
		}
		t = arr[min];
		arr[min] = arr[x];
		arr[x] = t;
		Arrays.sort(arr, x + 1, len);
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 444, 994, 508, 72, 125, 299, 181, 238, 354, 223, 691, 249, 838, 890, 758, 675, 424, 199, 201, 788,
				609, 582, 979, 259, 901, 371, 766, 759, 983, 728, 220, 16, 158, 822, 515, 488, 846, 321, 908, 469, 84,
				460, 961, 285, 417, 142, 952, 626, 916, 247, 116, 975, 202, 734, 128, 312, 499, 274, 213, 208, 472, 265,
				315, 335, 205, 784, 708, 681, 160, 448, 365, 165, 190, 693, 606, 226, 351, 241, 526, 311, 164, 98, 422,
				363, 103, 747, 507, 669, 153, 856, 701, 319, 695, 52 };
//		int arr[] = { 626, 436, 819, 100, 382, 173, 817, 581, 220, 95, 814, 660, 397, 852, 15, 532, 564, 715, 179, 872,
//				236, 790, 223, 379, 83, 924, 454, 846, 742, 730, 689, 112, 110, 516, 85, 149, 228, 202, 988, 212, 69,
//				602, 887, 445, 327, 527, 347, 906, 54, 460, 517, 376, 395, 494, 827, 448, 919, 799, 133, 879, 709, 184,
//				812, 514, 976, 700, 156, 568, 453, 267, 547, 8, 951, 326, 652, 772, 213, 714, 706, 972, 318, 768, 506,
//				59, 854, 422 };
		System.out.println(arr.length);
		System.out.println(Arrays.toString(new NextPerm().nextPermutation(arr)));
	}

}
