package com.exam;

public class MyClass {
	static int a = 200;
	//被宣告為static的成員，是將類別名稱作為名稱空間，也就是透過類別名稱與.運算子，就可以取得static成員

    public static void main(String[] args) {
        MyClass c = new MyClass();
        System.out.println(c.a);
        c.a = 300;
        MyClass d = new MyClass();
        System.out.println(d.a);
    }

}
