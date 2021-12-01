package of.leetcode.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidMountainTest {
	private static Stream<Arguments> provideValidTestData () {
		return Stream.of (
			Arguments.of (new int[]{0, 3, 2, 1}),
			Arguments.of (new int[]{0, 1, 2, 4, 2, 1})
		);
	}

	private static Stream<Arguments> provideInvalidTestData () {
		return Stream.of (
			Arguments.of (new int[]{2, 1}),
			Arguments.of (new int[]{3, 5, 5}),
			Arguments.of (new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9})
		);
	}

	@ParameterizedTest
	@MethodSource("provideValidTestData")
	public void testValidData (int[] validTestData) {
		ValidMountain validMountain = new ValidMountain ();
		boolean result = validMountain.validMountainArray (validTestData);
		assertTrue (result);
	}

	@ParameterizedTest
	@MethodSource("provideInvalidTestData")
	public void testInvalidData (int[] invalidTestData) {
		ValidMountain validMountain = new ValidMountain ();
		boolean result = validMountain.validMountainArray (invalidTestData);
		assertFalse (result);
	}
}
