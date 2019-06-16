package com.exam;

public class Student2 {
		int score;
	    static int pass = 60;
	    public Student2(int score) {
	        this.score = score;
	    }

	    public void print(){
	        System.out.print(score);
	        if (score < pass) {
	            System.out.println("\tFAILED");
	        }else {
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        Student2.pass = 70;
	        Student2 tom = new Student2(63);
	        Student2 jack = new Student2(55);
	        tom.print();
	        jack.print();
	    }

	

}
