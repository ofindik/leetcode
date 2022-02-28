package of.leetcode.hashset;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MyHashSetTest {

	@Test
	public void check_AddedElement_Exists () {
		MyHashSet myHashSet = new MyHashSet ();
		myHashSet.add (1);      // set = [1]
		myHashSet.add (2);      // set = [1, 2]
		assertTrue (myHashSet.contains (1)); // return True
	}

	@Test
	public void check_NotAddedElement_DoesNotExist () {
		MyHashSet myHashSet = new MyHashSet ();
		myHashSet.add (1);      // set = [1]
		myHashSet.add (2);      // set = [1, 2]
		assertFalse (myHashSet.contains (3)); // return True
	}

	@Test
	public void check_DoubleAddedElement_Exists () {
		MyHashSet myHashSet = new MyHashSet ();
		myHashSet.add (1);      // set = [1]
		myHashSet.add (2);      // set = [1, 2]
		myHashSet.add (2);      // set = [1, 2]
		assertTrue (myHashSet.contains (2)); // return True
	}

	@Test
	public void check_RemovedAddedElement_DoesNotExist () {
		MyHashSet myHashSet = new MyHashSet ();
		myHashSet.add (1);      // set = [1]
		myHashSet.add (2);      // set = [1, 2]
		myHashSet.add (2);      // set = [1, 2]
		myHashSet.remove(2);   // set = [1]
		assertFalse (myHashSet.contains (2)); // return True
	}
}
