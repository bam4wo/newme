package com.exam;

public class Box {
    String name = "BOX";
    public Box(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Box box = new Box("BOX"); 
    	//上面已經定義了Box裡有字串，所以new建構子時裡面也要有字串
        System.out.println(box.name);
    }
}
