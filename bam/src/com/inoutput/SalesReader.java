package com.inoutput;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class SalesReader {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("sales.txt");
			InputStreamReader irs = new InputStreamReader(fis);
			BufferedReader in = new BufferedReader(irs);
			String line = in.readLine();
			while(line!= null) {
				//System.out.println(line); 跑出多行結果
				String[] token = line.split(",");
				if(token.length == 2) {
					System.out.println(token[0]+"/"+token[1]+" ");
				}
				line = in.readLine(); //一定要記得，不然也會出現多行結果
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
