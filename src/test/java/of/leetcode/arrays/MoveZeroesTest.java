package of.leetcode.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoveZeroesTest {

	@Test
	public void test1 () {
		MoveZeroes moveZeroes = new MoveZeroes ();
		int[] nums = new int[]{0, 1, 0, 3, 12};
		moveZeroes.moveZeroes (nums);
		boolean result = Arrays.equals (nums, new int[]{1, 3, 12, 0, 0});
		assertTrue (result);
	}

	@Test
	public void test2 () {
		MoveZeroes moveZeroes = new MoveZeroes ();
		int[] nums = new int[]{0};
		moveZeroes.moveZeroes (nums);
		boolean result = Arrays.equals (nums, new int[]{0});
		assertTrue (result);
	}

	@Test
	public void test3 () {
		MoveZeroes moveZeroes = new MoveZeroes ();
		int[] nums = new int[]{1, 0};
		moveZeroes.moveZeroes (nums);
		boolean result = Arrays.equals (nums, new int[]{1, 0});
		assertTrue (result);
	}

	@Test
	public void test4 () {
		MoveZeroes moveZeroes = new MoveZeroes ();
		int[] nums = new int[]{2, 1};
		moveZeroes.moveZeroes (nums);
		boolean result = Arrays.equals (nums, new int[]{2, 1});
		assertTrue (result);
	}
}
