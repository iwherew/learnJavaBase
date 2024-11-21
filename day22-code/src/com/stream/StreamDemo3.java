package com.stream;

import java.util.stream.Stream;

/*
    Stream流的终结操作方法
        流水线中的最后一道工序

        public void forEach(Consumer action) 对此流的每个元素执行遍历操作
        public long count()返回此流中的元素数
 */
public class StreamDemo3 {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5).filter(v -> v > 2).forEach(System.out::println);
        long count = Stream.of(1, 2, 3, 4, 5).filter(v -> v > 2).count();
        System.out.println(count);
    }
}
