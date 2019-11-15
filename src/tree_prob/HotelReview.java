package tree_prob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HotelReview {

	class TrieNode {
		Map<Character, TrieNode> trieNode;
		boolean isEnd;

		TrieNode() {
			isEnd = false;
			trieNode = new HashMap<>();
		}
	}

	public void insertInTrie(TrieNode head, String s) {
		TrieNode node = head;
		for (int i = 0; i < s.length(); i++) {
			if (!node.trieNode.containsKey(s.charAt(i)))
				node.trieNode.put(s.charAt(i), new TrieNode());
			node = node.trieNode.get(s.charAt(i));
		}
		node.isEnd = true;
	}

	public boolean searchInTrie(TrieNode head, String s) {
		if (head == null) {
			return false;
		}
		TrieNode node = head;
		for (int i = 0; i < s.length(); i++) {
			if (!node.trieNode.containsKey(s.charAt(i)))
				return false;
			node = node.trieNode.get(s.charAt(i));
		}
		return node.isEnd;
	}

	public ArrayList<Integer> solve(String aStr, ArrayList<String> aList) {
		TrieNode head = new TrieNode();
		for (String s : aStr.split("_")) {
			this.insertInTrie(head, s);
		}

		TreeMap<Integer, ArrayList<Integer>> ansMap = new TreeMap<>();
		for (int i = 0; i < aList.size(); i++) {
			int c = 0;
			for (String t : aList.get(i).split("_")) {
				if (this.searchInTrie(head, t))
					++c;
			}
			if (!ansMap.containsKey(c))
				ansMap.put(c, new ArrayList<Integer>());
			ansMap.get(c).add(i);
		}
		ArrayList<Integer> ansList = new ArrayList<>();
		for (int c : ansMap.descendingKeySet()) {
			ansList.addAll(ansMap.get(c));
		}
		return ansList;
	}
}
