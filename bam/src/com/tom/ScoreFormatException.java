package com.tom;

import java.util.Scanner;

public class ScoreFormatException extends Exception{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int grade = scanner.nextInt();
		if(grade>100 && grade<0) {
			System.out.println("訊息成績應為0~100");
		}else if(grade<=100 || grade>=0) {
		
		}else {
			System.out.println("訊息格式錯誤");
		}
	
	}
}
