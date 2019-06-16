package com.exam;

public class Class {
	 static int a = 200;

	    public static void main(String[] args) {
	        Class.a = 300;
	        Class c = new Class();
	        System.out.println(c.a);
	        Class d = new Class();
	        System.out.println(d.a);
	    }
}
