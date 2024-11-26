package com.set.hashSet;

import java.util.HashSet;

public class HashSetDemo1 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("c");
        hs.add("b");
        hs.add("a");
        hs.add("b");

        System.out.println(hs);
    }
}
