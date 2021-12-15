package of.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ThirdMaximumNumberTest {

	@Test
	public void test1 () {
		ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber ();
		int result = thirdMaximumNumber.thirdMax (new int[]{3, 2, 1});
		assertTrue (result == 1);
	}

	@Test
	public void test2 () {
		ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber ();
		int result = thirdMaximumNumber.thirdMax (new int[]{1, 2});
		assertTrue (result == 2);
	}

	@Test
	public void test3 () {
		ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber ();
		int result = thirdMaximumNumber.thirdMax (new int[]{2, 2, 3, 1});
		assertTrue (result == 1);
	}

	@Test
	public void test4 () {
		ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber ();
		int result = thirdMaximumNumber.thirdMax (new int[]{5, 2, 2});
		assertTrue (result == 5);
	}

	@Test
	public void test5 () {
		ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber ();
		int result = thirdMaximumNumber.thirdMax (new int[]{1, 2, -2147483648});
		assertTrue (result == -2147483648);
	}
}
