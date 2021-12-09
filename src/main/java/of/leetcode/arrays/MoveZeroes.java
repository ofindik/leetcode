package of.leetcode.arrays;

import java.util.Arrays;

public class MoveZeroes {

	/*
	 * Given an integer array nums, move all 0's to the end of it
	 * while maintaining the relative order of the non-zero elements.
	 *
	 * Note that you must do this in-place without making a copy of the array.
	 */
	public void moveZeroes (int[] nums) {
		System.out.println ("Runnig for: " + Arrays.toString (nums));
		if (nums.length == 1) {
			return;
		}
		int writePointer = 0;
		for (int readPointer = 0; readPointer < nums.length - 1; readPointer++) {
			System.out.println (
				"Before wp: " + writePointer + " rp:" + readPointer + " nums:" + Arrays.toString (nums));
			if (nums[readPointer] != 0) {
				writePointer++;
			} else {
				if (nums[readPointer + 1] != 0) {
					nums[writePointer++] = nums[readPointer + 1];
					nums[readPointer + 1] = 0;
				}
			}
			System.out.println ("After wp: " + writePointer + " rp:" + readPointer + " nums:" + Arrays.toString (nums));
		}
	}
}
