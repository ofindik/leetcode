package of.leetcode.arrays;

import java.util.Arrays;

public class HeightChecker {

	/*
	 * A school is trying to take an annual photo of all the students.
	 * The students are asked to stand in a single file line in non-decreasing order by height.
	 * Let this ordering be represented by the integer array expected
	 * where expected[i] is the expected height of the ith student in line.
	 *
	 * You are given an integer array heights representing the current order that the students are standing in.
	 * Each heights[i] is the height of the ith student in line (0-indexed).
	 *
	 * Return the number of indices where heights[i] != expected[i].
	 * */
	public int heightChecker (int[] heights) {
		System.out.println ("Runnig for: " + Arrays.toString (heights));
		int[] expected = new int[heights.length];
		for (int i = 0; i < heights.length; i++) {
			insertInOrder (expected, heights[i]);
		}
		System.out.println ("expected: " + Arrays.toString (expected));
		int result = 0;
		for (int i = 0; i < heights.length; i++) {
			if (heights[i] != expected[i]) {
				result++;
			}
		}
		System.out.println ("result: " + result);
		return result;
	}

	private void insertInOrder (int[] expected, int value) {
		System.out.println ("expected: " + Arrays.toString (expected) + " value:" + value);
		for (int i = 0; i < expected.length; i++) {
			if (value < expected[i] || expected[i] == 0) {
				openSpace (expected, i);
				expected[i] = value;
				break;
			}
		}
	}

	private void openSpace (int[] expected, int index) {
		System.out.println ("expected: " + Arrays.toString (expected) + " index:" + index);
		for (int i = expected.length - 2; i >= index; i--) {
			expected[i + 1] = expected[i];
		}
	}
}
