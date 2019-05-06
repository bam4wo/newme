package com.pizaang;

import java.util.Scanner;

public class Pizza {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("pizza 想切幾塊? (8,12,16)");
			Much much = new Much(scanner.nextLine());
		} catch (NumberException e) {
			e.printStackTrace();
		} catch (OutofRangeException e) {
			e.printStackTrace();
		} catch (ZeroException e) {
			e.printStackTrace();
		}

	}

}
