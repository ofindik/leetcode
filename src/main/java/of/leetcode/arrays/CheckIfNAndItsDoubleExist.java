package of.leetcode.arrays;

import java.util.Arrays;

public class CheckIfNAndItsDoubleExist {

	/*
	 * Given an array arr of integers, check if there exists two integers N and M
	 * such that N is the double of M ( i.e. N = 2 * M).
	 *
	 * More formally check if there exists two indices i and j such that :
	 * - i != j
	 * - 0 <= i, j < arr.length
	 * - arr[i] == 2 * arr[j]
	 */
	public boolean checkIfExist (int[] arr) {
		System.out.println ("Runnig for: " + Arrays.toString (arr));
		for (int i = 0; i < arr.length; i++) {
			if (checkDouble (arr[i], i, arr)) {
				return true;
			}
		}
		return false;
	}

	private boolean checkDouble (int value, int index, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i != index) {
				if (value == arr[i] * 2) {
					System.out.println ("Found values: " + value + " - " + arr[i]);
					return true;
				}
			}
		}
		return false;
	}
}
