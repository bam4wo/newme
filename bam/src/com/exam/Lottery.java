package com.exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Lottery {
    Map<Integer, Integer> map = new HashMap<>();
    public Lottery(){
        for (int i=0; i<6; i++) {
            map.put(i, new Random().nextInt(39)+1);//表示1~39，如果沒+1為0~38
        }
    }
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        System.out.println(lottery.map.get(3));
        
    }
}
