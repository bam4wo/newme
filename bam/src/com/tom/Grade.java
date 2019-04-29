package com.tom;

import java.util.Scanner;

public class Grade {
	
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("請輸入數學成績");
			Score math = new Score(scanner.nextLine());
			System.out.println("請輸入英文成績");
			Score english = new Score(scanner.nextLine());
			System.out.println("平均為" + average);
		}catch(ScoreFormatException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
