package of.leetcode.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortArrayByParityTest {

	@Test
	public void test1 () {
		SortArrayByParity sortArrayByParity = new SortArrayByParity ();
		int[] resultArray = sortArrayByParity.sortArrayByParity (new int[]{3, 1, 2, 4});
		boolean result = Arrays.equals (resultArray, new int[]{2, 4, 3, 1});
		assertTrue (result);
	}

	@Test
	public void test2 () {
		SortArrayByParity sortArrayByParity = new SortArrayByParity ();
		int[] resultArray = sortArrayByParity.sortArrayByParity (new int[]{0});
		boolean result = Arrays.equals (resultArray, new int[]{0});
		assertTrue (result);
	}
}
