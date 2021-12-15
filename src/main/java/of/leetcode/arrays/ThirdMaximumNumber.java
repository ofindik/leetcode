package of.leetcode.arrays;

import java.util.Arrays;

public class ThirdMaximumNumber {

	/*
	 * Given an integer array nums, return the third distinct maximum number in this array.
	 * If the third maximum does not exist, return the maximum number.
	 */
	public int thirdMax (int[] nums) {
		System.out.println ("Runnig for: " + Arrays.toString (nums));
		Integer firstMax = null;
		Integer secondMax = null;
		Integer thirdMax = null;
		for (Integer number : nums) {
			if (number.equals (firstMax) || number.equals (secondMax) || number.equals (thirdMax)) {
				continue;
			}
			if (firstMax == null || number > firstMax) {
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = number;
			} else if (secondMax == null || number > secondMax) {
				thirdMax = secondMax;
				secondMax = number;
			} else if (thirdMax == null || number > thirdMax) {
				thirdMax = number;
			}
		}
		return (thirdMax != null) ? thirdMax : firstMax;
	}
}
