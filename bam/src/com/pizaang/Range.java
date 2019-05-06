package com.pizaang;

public class Range {
	int number;
	public Range(String s) throws OutofRangeException{
		number = Integer.parseInt(s);
		if(number != 0) {
			
		}else {
			throw new OutofRangeException();
		}
	}
}
