package com.exam;

import java.util.ArrayList;
import java.util.List;

public class ListTester {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(5);
		list.add(3);
		list.add("Test");
		System.out.println(list.get(2)); //取索引2的Test
		
		List list2 = new ArrayList();
		list2.add(5);
		list2.add(3);
		list2.add(9);
		list2.add(3);
		System.out.println(list2.get(4)); //索引4沒東西
	}

}
