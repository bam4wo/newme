package com.www;

public class Ticket {
		String name;
		int quantity;
		double price;
		
		public Ticket(String name, int quantity, double price) {
			this.name = name;
			this.quantity = quantity;
			this.price = price;
		}
		
		public void print(){
			System.out.println(name+"\t"+quantity+"\t"+price);
		}
	

}
