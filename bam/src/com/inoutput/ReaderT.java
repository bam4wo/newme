package com.inoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderT {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("data.txt");
			Reader r = new InputStreamReader(fis); //記得new啊啊啊啊
			int t = r.read();
			while(t!= -1) {
				System.out.println(t);
				System.out.print((char)t);
				t = r.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
