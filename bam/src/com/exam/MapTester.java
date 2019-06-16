package com.exam;

import java.util.HashMap;
import java.util.Map;

public class MapTester {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Jack");
        map.put(2, "Hank");
        System.out.println(map.get(0));//0索引沒放東西，所以為null
    }
}