package of.leetcode;

import java.util.Arrays;

public class CheckIfNAndItsDoubleExist {
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
