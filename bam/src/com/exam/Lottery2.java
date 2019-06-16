package com.exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Lottery2 {
	Map<Integer, Integer> map = new HashMap<>();
    public Lottery2(){
        for (int i=0; i<6; i++) {
            //map.add(i, new Random().nextInt(39)+1); map中沒有add
        	map.put(i, new Random().nextInt(39)+1);
        }
    }
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        System.out.println(lottery.map.get(3));
    }
}
