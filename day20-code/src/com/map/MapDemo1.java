package com.map;

import java.util.HashMap;

/*
    Map集合常用API
        public V put(K key,v value) 添加/覆盖 元素
        public V remove(Object key) 根据键删除链值对元素
        public void clear() 移除所有的键值对元素
        public boolean containsKey(Object key) 判断集合是否包含指定的键
        public boolean containsValve(Object valve) 判断集合是否包含指定的值
        public boolean isEmpty() 判断集合是否为空
        public int size() 集合的长度，也就是集合中键值对的个数
 */
public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a","1");
        map.put("b","1");
        map.put("c","2");

        System.out.println(map);
    }
}
