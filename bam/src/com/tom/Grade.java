package com.tom;

import java.util.Scanner;

public class Grade {
	
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("�п�J�ƾǦ��Z");
			Score math = new Score(scanner.nextLine());
			System.out.println("�п�J�^�妨�Z");
			Score english = new Score(scanner.nextLine());
			System.out.println("������" + average);
		}catch(ScoreFormatException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
