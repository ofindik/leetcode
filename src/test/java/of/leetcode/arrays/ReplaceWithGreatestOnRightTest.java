package of.leetcode.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class ReplaceWithGreatestOnRightTest {

	@Test
	public void test1 () {
		ReplaceWithGreatestOnRight replaceWithGreatestOnRight = new ReplaceWithGreatestOnRight ();
		int[] resultArray = replaceWithGreatestOnRight.replaceElements (new int[]{17, 18, 5, 4, 6, 1});
		boolean result = Arrays.equals (resultArray, new int[]{18, 6, 6, 6, 1, -1});
		assertTrue (result);
	}

	@Test
	public void test2 () {
		ReplaceWithGreatestOnRight replaceWithGreatestOnRight = new ReplaceWithGreatestOnRight ();
		int[] resultArray = replaceWithGreatestOnRight.replaceElements (new int[]{400});
		boolean result = Arrays.equals (resultArray, new int[]{-1});
		assertTrue (result);
	}
}
