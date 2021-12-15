package of.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {

	/*
	 * Given an array nums of n integers where nums[i] is in the range [1, n],
	 * return an array of all the integers in the range [1, n] that do not appear in nums.
	 */
	public List<Integer> findDisappearedNumbers (int[] nums) {
		System.out.println ("Runnig for: " + Arrays.toString (nums));
		int[] sortedArray = new int[nums.length];
		List<Integer> resultList = new ArrayList<> ();
		for (int i = 0; i < nums.length; i++) {
			int value = nums[i];
			sortedArray[value - 1] = 1;
		}
		System.out.println ("sortedArray: " + Arrays.toString (sortedArray));
		for (int i = 0; i < nums.length; i++) {
			if (sortedArray [i] == 0) {
				resultList.add (i+1);
			}
		}
		System.out.println ("resultList: " + Arrays.toString (resultList.toArray ()));
		return resultList;
	}
}
