package of.leetcode.linkedlist.singly;

public class ListNode {
	public final int value;
	public ListNode next;

	ListNode (int value) {
		this.value = value;
	}

	@Override
	public String toString () {
		return "ListNode{" +
			"value=" + value +
			", next=" + next +
			'}';
	}
}
