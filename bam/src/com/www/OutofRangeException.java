package com.www;

public class OutofRangeException extends Exception{

	@Override
	public String getMessage() {
		return "超出範圍";
	}
	
	
}
