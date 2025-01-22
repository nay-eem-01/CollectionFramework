package com.practice.SetPractice;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetClassDemo {
    public static void main(String[] args) {
        Set<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        Set<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for (int i = 1; i <= 5; i++) {
            copyOnWriteArraySet.add(i);
            concurrentSkipListSet.add(i);
        }
        System.out.println("CopyOnWriteArraySet Before: " + copyOnWriteArraySet);
        System.out.println("concurrentSkipListSet Before: " + concurrentSkipListSet);

        for(Integer i : copyOnWriteArraySet){
            System.out.println("Reading from copyOnWriteArraySet: " + i);
            copyOnWriteArraySet.add(6);
        }
        System.out.println(copyOnWriteArraySet);
        for(Integer i : concurrentSkipListSet){
            System.out.println("Reading from concurrentSkipListSet: " + i);
            concurrentSkipListSet.add(6);
        }
        System.out.println(concurrentSkipListSet);

    }

}
