package of.leetcode.linkedlist.singly;

public class MyLinkedList {
	int size = 0;
	ListNode head = null;

	public MyLinkedList () {

	}

	public int get (int index) {
		System.out.println ("get: size: " + size + " index: " + index);
		if (size <= index) {
			System.out.println ("get will return -1. size: " + size + " index: " + index);
			return -1;
		}
		ListNode pointer = head;
		System.out.println ("pointer: " + pointer);
		for (int i = 0; i < index; i++) {
			if (null != pointer && null != pointer.next) {
				pointer = pointer.next;
			} else {
				break;
			}
		}
		System.out.println ("pointer: " + pointer);
		return (pointer != null) ? pointer.value : -1;
	}

	public void addAtHead (int value) {
		ListNode newNode = new ListNode (value);
		newNode.next = head;

		head = newNode;
		size++;
		System.out.println (this);
	}

	public void addAtTail (int value) {
		ListNode pointer = head;
		while (null != pointer && null != pointer.next) {
			pointer = pointer.next;
		}
		ListNode newNode = new ListNode (value);
		newNode.next = null;

		if (null != pointer) {
			pointer.next = newNode;
		} else {
			head = newNode;
		}
		size++;
		System.out.println (this);
	}

	public void addAtIndex (int index, int value) {
		System.out.println ("addAtIndex index: " + index + " value: " + value);
		if (size < index) {
			System.out.println ("addAtIndex ignored. size: " + size + " index: " + index);
			return;
		}
		if (index == 0) {
			addAtHead (value);
			return;
		}
		ListNode pointer = head;
		for (int i = 0; i < index - 1; i++) {
			if (null != pointer && null != pointer.next) {
				pointer = pointer.next;
			} else {
				break;
			}
		}
		ListNode newNode = new ListNode (value);
		if (null != pointer) {
			newNode.next = pointer.next;
			pointer.next = newNode;
		} else {
			newNode.next = null;
			head = newNode;
		}
		size++;
		System.out.println (this);
	}

	public void deleteAtIndex (int index) {
		System.out.println ("deleteAtIndex index: " + index);
		if (size <= index) {
			System.out.println ("deleteAtIndex ignored. size: " + size + " index: " + index);
			return;
		}
		if (index == 0) {
			if (null != head) {
				head = head.next;
				size--;
				System.out.println (this);
				return;
			}
		}
		ListNode pointer = head;
		for (int i = 0; i < index - 1; i++) {
			if (null != pointer && null != pointer.next) {
				if (null != pointer) {
					pointer = pointer.next;
				} else {
					return;
				}
			}
		}
		pointer.next = (null != pointer.next && null != pointer.next.next) ? pointer.next.next : null;
		size--;
		System.out.println (this);
	}

	@Override
	public String toString () {
		return "MyLinkedList{" +
			"size=" + size +
			", head=" + head +
			'}';
	}
}
