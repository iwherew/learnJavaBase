package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    遍历map
 */
public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key + ":" + map.get(key));
        }

        System.out.println("-----------");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("-----------");

        map.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
