package of.leetcode.hashset;

import java.util.ArrayList;
import java.util.List;

public class MyHashSet {
	boolean[] keyArray = new boolean[1000000];

	public void add (int key) {
		keyArray[key] = true;
	}

	public void remove (int key) {
		keyArray[key] = false;
	}

	public boolean contains (int key) {
		return keyArray[key];
	}
}
