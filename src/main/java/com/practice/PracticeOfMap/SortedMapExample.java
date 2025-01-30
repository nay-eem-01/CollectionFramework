package com.practice.PracticeOfMap;

import com.practice.PracticeOfList.Student;

import java.util.*;

public class SortedMapExample {
    public static void main(String[] args) {

        SortedMap<Integer,String> sortedMap = new TreeMap<>((a,b)-> b-a);
        sortedMap.put(2,"Nayeem");
        sortedMap.put(1,"Fantasir");
        sortedMap.put(5,"Rakib");
        sortedMap.put(3,"Sadid");
        sortedMap.put(4,"hasib");



//        System.out.println( sortedMap.firstKey());
//        System.out.println(sortedMap.lastKey());
//        System.out.println(sortedMap.firstEntry());
//        System.out.println(sortedMap.lastEntry());
//        System.out.println(sortedMap.tailMap(3));
//        System.out.println(sortedMap.headMap(4));
//
        //Using comparator
        Comparator<Student> comparator = (s1,s2)-> Double.compare(s2.getCgpa(),s1.getCgpa());

        SortedMap<Student,Integer> map = new TreeMap<>(comparator);
        map.put(new Student(23,"Alex",3.4),6);
        map.put(new Student(12,"Bob",3.2),3);
        map.put(new Student(20,"Eve",3.8),1);
        map.put(new Student(7,"Farguson",3.1),9);
        map.put(new Student(2,"Sia",3.67),4);



        for (Map.Entry<Student,Integer> iterator : map.entrySet()){
            System.out.println("Key: " + iterator.getKey() + ": Value: " + iterator.getValue());
        }


    }
}
