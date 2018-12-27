package com.inter.prep.linkedL;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Duplicates {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("a");
		list.add("c");
		list.add("e");

		dDup(list);
	}

	public static void dDup(List<String> list) {
		HashSet<String> set = new HashSet<>();
		set.addAll(list);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
