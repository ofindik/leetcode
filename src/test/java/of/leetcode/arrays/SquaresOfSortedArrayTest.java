package of.leetcode.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SquaresOfSortedArrayTest {

	@Test
	public void test1 () {
		SquaresOfSortedArray squaresOfSortedArray = new SquaresOfSortedArray ();
		int[] resultArray = squaresOfSortedArray.sortedSquares (new int[]{-4, -1, 0, 3, 10});
		boolean result = Arrays.equals (resultArray, new int[]{0, 1, 9, 16, 100});
		assertTrue (result);
	}

	@Test
	public void test2 () {
		SquaresOfSortedArray squaresOfSortedArray = new SquaresOfSortedArray ();
		int[] resultArray = squaresOfSortedArray.sortedSquares (new int[]{-7, -3, 2, 3, 11});
		boolean result = Arrays.equals (resultArray, new int[]{4, 9, 9, 49, 121});
		assertTrue (result);
	}

	@Test
	public void test3 () {
		SquaresOfSortedArray squaresOfSortedArray = new SquaresOfSortedArray ();
		int[] resultArray = squaresOfSortedArray.sortedSquares (new int[]{-5, -3, -2, -1});
		boolean result = Arrays.equals (resultArray, new int[]{1, 4, 9, 25});
		assertTrue (result);
	}
}
