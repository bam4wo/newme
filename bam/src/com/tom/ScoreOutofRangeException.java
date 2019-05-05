package com.tom;

public class ScoreOutofRangeException extends Exception{

	@Override
	public String getMessage() {
		return "Score out of range";
	}

}
