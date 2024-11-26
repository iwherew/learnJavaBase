package com.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, "aaa", "aa", "a", "aab", "ddd", "rrr", "g", "h");

        list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
    }
}
