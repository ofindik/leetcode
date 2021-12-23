package of.leetcode.linkedlist.singly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyLinkedListTest {

	@Test
	public void test1 () {
		System.out.println ("test1");
		MyLinkedList myLinkedList = new MyLinkedList ();
		myLinkedList.addAtHead (5);
		int result = myLinkedList.get (0);
		assertTrue (result == 5);
	}

	@Test
	public void test2 () {
		System.out.println ("test2");
		MyLinkedList myLinkedList = new MyLinkedList ();
		myLinkedList.addAtTail (5);
		int result = myLinkedList.get (0);
		assertTrue (result == 5);
	}

	@Test
	public void test3 () {
		System.out.println ("test3");
		MyLinkedList myLinkedList = new MyLinkedList ();
		myLinkedList.addAtIndex (0, 5);
		int result = myLinkedList.get (0);
		assertTrue (result == 5);
	}

	@Test
	public void test4 () {
		System.out.println ("test4");
		MyLinkedList myLinkedList = new MyLinkedList ();
		myLinkedList.addAtIndex (0, 1);  // 1
		myLinkedList.addAtIndex (1, 2);  // 1 -> 2
		myLinkedList.addAtIndex (2, 3);  // 1 -> 2 -> 3
		myLinkedList.addAtIndex (3, 4);  // 1 -> 2 -> 3 -> 4
		myLinkedList.addAtIndex (4, 5);  // 1 -> 2 -> 3 -> 4 -> 5
		myLinkedList.addAtIndex (3, 33); // 1 -> 2 -> 3 -> 33 -> 4 -> 5
		int result1 = myLinkedList.get (0);
		int result2 = myLinkedList.get (3);
		int result3 = myLinkedList.get (5);
		assertTrue (result1 == 1 && result2 == 33 && result3 == 5);
	}

	@Test
	public void test5 () {
		System.out.println ("test5");
		MyLinkedList myLinkedList = new MyLinkedList ();
		myLinkedList.addAtIndex (0, 1);  // 1
		myLinkedList.addAtIndex (1, 2);  // 1 -> 2
		myLinkedList.addAtIndex (2, 3);  // 1 -> 2 -> 3
		myLinkedList.addAtIndex (3, 4);  // 1 -> 2 -> 3 -> 4
		myLinkedList.addAtIndex (4, 5);  // 1 -> 2 -> 3 -> 4 -> 5
		myLinkedList.deleteAtIndex (3); // 1 -> 2 -> 3 -> 5
		int result1 = myLinkedList.get (0);
		int result2 = myLinkedList.get (2);
		int result3 = myLinkedList.get (3);
		assertTrue (result1 == 1 && result2 == 3 && result3 == 5);
	}

	@Test
	public void test6 () {
		System.out.println ("test6");
		MyLinkedList myLinkedList = new MyLinkedList ();
		myLinkedList.addAtHead (1);
		myLinkedList.addAtTail (3);
		myLinkedList.addAtIndex (0, 2);
		myLinkedList.deleteAtIndex (1);
		int result = myLinkedList.get (1);
		assertTrue (result == 3);
	}

	@Test
	public void test7 () {
		System.out.println ("test7");
		MyLinkedList myLinkedList = new MyLinkedList ();
		myLinkedList.addAtHead (1);
		myLinkedList.addAtTail (3);
		myLinkedList.addAtIndex (1, 2);
		myLinkedList.deleteAtIndex (0);
		int result = myLinkedList.get (0);
		assertTrue (result == 2);
	}

	@Test
	public void test8 () {
		System.out.println ("test8");
		MyLinkedList myLinkedList = new MyLinkedList ();
		myLinkedList.addAtHead (4); // 4
		int result1 = myLinkedList.get (1);
		System.out.println ("result1: " + result1);
		myLinkedList.addAtHead (1); // 1 -> 4
		myLinkedList.addAtHead (5); // 5 -> 1 -> 4
		myLinkedList.deleteAtIndex (3);   // 5 -> 1 -> 4
		myLinkedList.addAtHead (7); // 7 -> 5 -> 1 -> 4
		myLinkedList.addAtHead (1); // 1 -> 7 -> 5 -> 1 -> 4
		myLinkedList.deleteAtIndex (4);   // 1 -> 7 -> 5 -> 1
		int result2 = myLinkedList.get (2);
		System.out.println ("result2: " + result2);

		assertTrue (result1 == -1 && result2 == 5);
	}

	@Test
	public void test9 () {
		System.out.println ("test9");
		MyLinkedList myLinkedList = new MyLinkedList ();
		myLinkedList.addAtIndex (1, 0);
		int result = myLinkedList.get (0);

		assertTrue (result == -1);
	}

	@Test
	public void test10 () {
		System.out.println ("test10");
		MyLinkedList myLinkedList = new MyLinkedList ();
		myLinkedList.addAtHead (4);   // 4
		int result1 = myLinkedList.get (1); // (-1)
		myLinkedList.addAtHead (1);   // 1 -> 4
		myLinkedList.addAtHead (5);   // 5 -> 1 -> 4
		myLinkedList.deleteAtIndex (3);     // 5 -> 1 -> 4
		myLinkedList.addAtHead (7);   // 7 -> 5 -> 1 -> 4
		int result2 = myLinkedList.get (3); // (4)
		myLinkedList.addAtHead (1);   // 1 -> 7 -> 5 -> 1 -> 4
		myLinkedList.deleteAtIndex (4);     // 1 -> 7 -> 5 -> 1

		assertTrue (result1 == -1 && result2 == 4);
	}
}
