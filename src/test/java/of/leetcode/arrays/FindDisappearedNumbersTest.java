package of.leetcode.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindDisappearedNumbersTest {

	@Test
	public void test1 () {
		FindDisappearedNumbers findDisappearedNumbers = new FindDisappearedNumbers ();
		List<Integer> resultList = findDisappearedNumbers.findDisappearedNumbers (new int[]{4, 3, 2, 7, 8, 2, 3, 1});
		List<Integer> expectedList = new ArrayList<> ();
		expectedList.add (5);
		expectedList.add (6);
		assertTrue (resultList.equals (expectedList));
	}

	@Test
	public void test2 () {
		FindDisappearedNumbers findDisappearedNumbers = new FindDisappearedNumbers ();
		List<Integer> resultList = findDisappearedNumbers.findDisappearedNumbers (new int[]{1, 1});
		List<Integer> expectedList = new ArrayList<> ();
		expectedList.add (2);
		assertTrue (resultList.equals (expectedList));
	}
}
