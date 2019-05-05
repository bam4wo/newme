package com.www;

public class Much {
	int number;
	public Much(String s) throws NumberException{
		number = Integer.parseInt(s);
		if(number!=8 && number!=12 && number!=16) {
			throw new NumberException();
		}else {
			System.out.println("謝謝選購");
		}
	}
}
