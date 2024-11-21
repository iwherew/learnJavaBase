package com.tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    public static <T> boolean addAll(Collection<? super T> c, T... elements)  给集合对象批量添加元素
    public static void shuffle(List<?> list)    打乱List集合元素的顺序
    public static <T> int binarySearch(List<T> list, T key) 以二分查找法查找元素【必须是排好序的数据】
    public static <T> void max/min(Collection<T> coll) 根据默认的自然排序获取最大/小值【对象需要实现compareTo方法才能使用】
    public static <T> void swap(List<?> list, int i, int j) 交换集合中指定位置的元素
    public static <T> void sort(List<T> list) 默认排序规则
    public static <T> void sort(List<T> list, Comparator<? super T> c) 自定义排序规则
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d", "e");
        System.out.println(list);

        System.out.println(Collections.binarySearch(list, "b"));
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        Collections.shuffle(list);
        System.out.println(list);

        Collections.sort(list, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return 1;
            }
        });
    }
}
