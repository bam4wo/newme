package com.tom;

public class Score extends Grade {
	int value;
	public Score(String s) throws ScoreFormatException{
		try {
			value = Integer.parseInt(s);
		}catch(NumberFormatException e) {
			throw new ScoreFormatException();
		}catch(Exception b) {
			try {
				throw new ScoreOutofRangeException();
			}catch(ScoreOutofRangeException c) {
				c.printStackTrace();
			}
		}
	}
}
