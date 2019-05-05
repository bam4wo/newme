package com.tom;

import java.util.Scanner;

public class Grade {
	
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter math");
			Score math = new Score(scanner.nextLine());
			System.out.println("Please enter english");
			Score english = new Score(scanner.nextLine());
			System.out.println((math.value + english.value)/2);
		}catch(ScoreFormatException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
