package com.pizza;

public class ZeroException extends Exception{

	@Override
	public String getMessage() {
		return "確定不要切?";
	}

}
