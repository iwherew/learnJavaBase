package com.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/*
    Stream流的中间操作方法
        操作后返回Stream对象，可以继续操作

        Stream<T> filter(Predicate<? super T> predicate) 用于对流中的数据进行过滤
        Stream<T> limit(long maxSize) 获取前几个元素
        Stream<T> skip(long n) 跳过前几个元素
        Stream<T> distinct() 去除流中重复的元素依赖(hashCode 和 equals方法)
        static <T> Stream<T> concat(Stream a, Stream b) 合并a和b两个流为一个流

        注意事项:流对象已经被消费过(使用过)，就不允许再次消费了。
 */
public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        Collections.addAll(arr1, "a", "b", "c");
        ArrayList<String> arr2 = new ArrayList<>();
        Collections.addAll(arr2, "c", "d", "e");

        Stream.concat(arr1.stream(), arr2.stream()).distinct().forEach(System.out::println);

    }
}
