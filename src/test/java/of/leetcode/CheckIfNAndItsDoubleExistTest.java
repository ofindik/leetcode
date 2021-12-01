package of.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckIfNAndItsDoubleExistTest {
	private static Stream<Arguments> provideValidTestData () {
		return Stream.of (
			Arguments.of (new int[]{10, 2, 5, 3}),
			Arguments.of (new int[]{0, 0})
		);
	}

	private static Stream<Arguments> provideInvalidTestData () {
		return Stream.of (
			Arguments.of (new int[]{3, 1, 7, 11}),
			Arguments.of (new int[]{-2, 0, 10, -19, 4, 6, -8})
		);
	}

	@ParameterizedTest
	@MethodSource("provideValidTestData")
	public void testValidData (int[] validTestData) {
		CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist = new CheckIfNAndItsDoubleExist ();
		boolean result = checkIfNAndItsDoubleExist.checkIfExist (validTestData);
		assertTrue (result);
	}

	@ParameterizedTest
	@MethodSource("provideInvalidTestData")
	public void testInvalidData (int[] invalidTestData) {
		CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist = new CheckIfNAndItsDoubleExist ();
		boolean result = checkIfNAndItsDoubleExist.checkIfExist (invalidTestData);
		assertFalse (result);
	}
}
