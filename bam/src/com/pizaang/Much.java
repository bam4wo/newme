package com.pizaang;

public class Much extends Pizza{
	int number;
	public Much(String s) throws NumberException, OutofRangeException,ZeroException{
		number = Integer.parseInt(s);
		if(number==8 && number==12 && number==16) {
			System.out.print("謝謝選購");
		}else if(number>16 && number<0) {
			throw new OutofRangeException();
		}else if(number == 0) {
			throw new ZeroException();
		}
	}
}
