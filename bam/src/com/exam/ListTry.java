package com.exam;

import java.util.ArrayList;
import java.util.List;

public class ListTry {
	
	public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	list.add(11);
	list.add(8);
	list.add(4);
	list.add(9);
	list.add(5);
	list.add(7);
	list.add(9);
	list.add(3);
	for (int i=0; i<list.size(); i++) {
	    if (i % 2 == 0)
	        list.remove(i);
	}
	System.out.println(list);
	//索引0的11會因為0%2==0而被刪掉，下一個8就會補到索引0的位置，以此類推
	
	List<Integer> list2 = new ArrayList<>();
	list2.add(5);
	list2.add(3);
	list2.add(13);
	list2.add(8);
	list2.add(4);
	list2.add(3);
	list2.add(9);
	list2.add(1);
	for (int i=0; i<list2.size(); i++) {
	    if (list2.get(i) % 2 == 0)
	        list2.remove(i);
	}
	System.out.println(list2);
}
}