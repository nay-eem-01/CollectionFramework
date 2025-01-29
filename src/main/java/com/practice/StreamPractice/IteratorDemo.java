package com.practice.StreamPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(12);
        list.add(6);
        list.add(7);
        list.add(8);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
                Integer num = iterator.next();
            if (num % 2 == 0){

                iterator.remove();
                System.out.println(num);

            }


        }
        System.out.println(list);
//
//        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//
//        for (Integer i : list){
//            System.out.println("Printing through For each loop: " + i);
//
//        }
//
//        for (Integer i : list){
//            if (i%2 == 0)
//                list.remove(i);
//            System.out.println(i);
//        }
//        System.out.println(list);


    }

}
