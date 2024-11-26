package com.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Stream流的收集操作
        public R collect(Collector c):将流中的数据收集到集合

            Collectors
                public static <T>Collector toList()
                public static <T> Collector toSet()
                public static Collector toMap(Function keyMapper , Function valueMapper)
 */
public class StreamDemo4 {
    public static void main(String[] args) {
        List<Integer> list = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 10).filter(v -> v % 2 == 0).collect(Collectors.toList());
        System.out.println(list);

        Set<Integer> set = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 10).filter(v -> v % 2 == 0).collect(Collectors.toSet());
        System.out.println(set);

        ArrayList<String> strList = new ArrayList<>();
        Collections.addAll(strList, "张三,23","李四,24","王五,25");
        Map<String, Integer> map = strList.stream().filter(str -> {
            String[] sArr = str.split(",");
            return Integer.parseInt(sArr[1]) >= 24;
        }).collect(Collectors.toMap(s -> s.split(",")[0],s -> Integer.parseInt(s.split(",")[1])));
        System.out.println(map);
    }
}
