package com.pizaang;

public class NumberException extends Exception{

	@Override
	public String getMessage() {
		return "數量錯誤";
	}
	
}
