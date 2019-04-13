package com.tom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		List<Item> items =new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String name = "";
		while(!name.equals("a")) {
			System.out.println("Please enter item name:");
			name = scanner.nextLine();
			System.out.println("Please enter quantity:");
			int quantity = Integer.parseInt(scanner.nextLine());
			items.add(new Item(name, quantity));
			for(Item item: items) {
				System.out.println(name+"\t"+quantity);
			}
		}

	}

}
