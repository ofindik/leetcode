package of.leetcode;

import java.util.Arrays;

public class ValidMountain {
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
