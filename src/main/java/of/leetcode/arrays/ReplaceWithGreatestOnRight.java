package of.leetcode.arrays;

import java.util.Arrays;

public class ReplaceWithGreatestOnRight {
	/*
	 * Given an array arr,
	 * replace every element in that array with the greatest element among the elements to its right,
	 * and replace the last element with -1.
	 *
	 * After doing so, return the array.
	 */
	public int[] replaceElements (int[] arr) {
		if (null == arr) {
			return null;
		}
		System.out.println ("Runnig for: " + Arrays.toString (arr));
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = getGreatestOnRight (arr, i);
		}
		arr[arr.length - 1] = -1;;
		return arr;
	}

	private int getGreatestOnRight (int[] arr, int startIndex) {
		int result = arr[startIndex + 1];
		for (int i = startIndex + 1; i < arr.length; i++) {
			if (arr[i] > result) {
				result = arr[i];
			}
		}
		System.out.println ("startIndex: " + startIndex + " greatest: " + result);
		return result;
	}
}
