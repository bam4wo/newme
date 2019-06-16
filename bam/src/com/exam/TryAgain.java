package com.exam;

import java.util.HashSet;
import java.util.Set;

public class TryAgain {

	public static void main(String[] args) {
		//Set set = new Set(); Set為抽象類別，不可直接new出來
		Set set = new HashSet();
		set.add("Apple");
		set.add("Banana");
		set.add("Tomato");
		System.out.println(set);

	}

}
