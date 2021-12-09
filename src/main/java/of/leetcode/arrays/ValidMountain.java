package of.leetcode.arrays;

import java.util.Arrays;

public class ValidMountain {

	/*
	 * Given an array of integers arr, return true if and only if it is a valid mountain array.
	 *
	 * Recall that arr is a mountain array if and only if:
	 * - arr.length >= 3
	 * - There exists some i with 0 < i < arr.length - 1 such that:
	 *   - arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
	 *   - arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
	 */
	public boolean validMountainArray (int[] arr) {
		System.out.println ("Runnig for: " + Arrays.toString (arr));
		if (arr.length < 3) {
			return false;
		}
		boolean increasing = true;
		if (arr[0] >= arr[1]) {
			return false;
		}
		for (int i = 1; i < (arr.length - 1); i++) {
			if (increasing) {
				System.out.println ("Increasing compare: " + arr[i] + " - " + arr[i + 1]);
				if (arr[i] == arr[i + 1]) {
					return false;
				} else if (arr[i] > arr[i + 1]) {
					increasing = false;
				}
			} else {
				System.out.println ("Decreasing compare: " + arr[i] + " - " + arr[i + 1]);
				if (arr[i] <= arr[i + 1]) {
					return false;
				}
			}
		}
		if (increasing) {
			return false;
		}
		return true;
	}
}
