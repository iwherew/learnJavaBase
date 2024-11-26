package com.set.hashSet;

import com.set.hashSet.domain.Student;

import java.util.HashSet;

public class HashDemo2 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        hs.add(new Student("amadeus", 18));
        hs.add(new Student("iwhere", 25));
        hs.add(new Student("wang", 50));
        hs.add(new Student("wang", 50));
        System.out.println(hs);
    }
}
