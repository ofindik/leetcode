package of.leetcode.arrays;

import java.util.Arrays;

public class SquaresOfSortedArray {

	/*
	 * Given an integer array nums sorted in non-decreasing order,
	 * return an array of the squares of each number sorted in non-decreasing order.
	 * */
	public int[] sortedSquares (int[] nums) {
		System.out.println ("Runnig for: " + Arrays.toString (nums));
		int[] result = new int[nums.length];
		int firstIndex = 0;
		int secondIndex = nums.length - 1;
		int index = nums.length - 1;
		for (int i = 0; i < nums.length; i++) {
			int firstSquare = square (nums[firstIndex]);
			int secondSquare = square (nums[secondIndex]);
			if (firstSquare > secondSquare) {
				result[index--] = firstSquare;
				firstIndex++;
			} else {
				result[index--] = secondSquare;
				secondIndex--;
			}
		}
		return result;
	}

	private int square (int num) {
		return num * num;
	}
}
