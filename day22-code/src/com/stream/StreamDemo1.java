package com.stream;

import java.util.*;
import java.util.stream.Stream;

/*
    获取Stream流对象演示
        -将数据放在流水线的传送带上

        1.集合获取 Stream 流对象(使用Collection接口中的默认方法)
            default Stream<E> stream()
            * Map集合获取Stream流对象，需要间接获取
                -map.entrySet()

        2.数组获取 Stream 流对象(使用Arrays数组工具类中的静态方法)
        static <T> stream<T> stream(T[]array)

        3.零散的数据获取 Stream 流对象(使用 Stream 类中的静态方法)
        static <T> stream<T> of(T... values)
 */
public class StreamDemo1 {
    public static void main(String[] args) {
        collectionToStream();
        arrayToStream();

        Stream.of(1, 2, 3, 4, 5).filter(v -> v % 2 == 0).forEach(s -> System.out.println(s));
    }

    private static void arrayToStream() {
        int[] arr1 = {11, 22, 33};
        double[] arr2 = {11.11, 22.22, 33.33};

        Arrays.stream(arr1).filter(v -> v < 30).forEach(s -> System.out.println(s));
        Arrays.stream(arr2).filter(v -> v < 30).forEach(s -> System.out.println(s));
    }

    private static void collectionToStream() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "dd");
        list.stream().filter(s -> s.length() == 1).forEach(s -> System.out.println(s));

        Set<String> set = new HashSet<>();
        Collections.addAll(set, "a", "b", "c", "dd");
        set.stream().filter(s -> s.length() == 1).forEach(s -> System.out.println(s));

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        map.entrySet().stream().filter(e -> e.getValue() == 2).forEach(e -> System.out.println(e.getKey()));
    }
}
