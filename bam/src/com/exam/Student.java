package com.exam;

public class Student {
	 int score;
	    public void print(){
	        System.out.print(score);
	    }

	    public static void main(String[] args) {
	    	Student tom = new Student();
	        //Student tom = new Student(63); 沒有指定Student的建構子內容，所以不能放東西進去
	        tom.print();
	    }
}
