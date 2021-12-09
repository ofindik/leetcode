package of.leetcode.arrays;

import java.util.Arrays;

public class SortArrayByParity {

	/*
	 * Given an integer array nums,
	 * move all the even integers at the beginning of the array followed by all the odd integers.
	 *
	 * Return any array that satisfies this condition.
	 */
	public int[] sortArrayByParity (int[] nums) {
		System.out.println ("Runnig for: " + Arrays.toString (nums));
		int oddIndex = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 0) {
				oddIndex = i;
				System.out.println ("oddIndex set as " + oddIndex);
			}
			if (oddIndex > -1) {
				for (int j = oddIndex + 1; j < nums.length; j++) {
					if (nums[j] % 2 == 0) {
						replaceArrayElements (nums, oddIndex, j);
						oddIndex = -1;
						break;
					}
				}
			}
			System.out.println ("Last status: " + Arrays.toString (nums));
		}
		return nums;
	}

	private void replaceArrayElements (int[] nums, int source, int target) {
		System.out.println ("Replacing " + nums[source] + " with " + nums[target]);
		int tmp = nums[source];
		nums[source] = nums[target];
		nums[target] = tmp;
	}
}
