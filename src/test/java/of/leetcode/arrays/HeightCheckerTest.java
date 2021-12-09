package of.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HeightCheckerTest {

	@Test
	public void test1 () {
		HeightChecker heightChecker = new HeightChecker ();
		int result = heightChecker.heightChecker (new int[]{1,1,4,2,1,3});
		assertTrue (result == 3);
	}

	@Test
	public void test2 () {
		HeightChecker heightChecker = new HeightChecker ();
		int result = heightChecker.heightChecker (new int[]{5,1,2,3,4});
		assertTrue (result == 5);
	}
}
