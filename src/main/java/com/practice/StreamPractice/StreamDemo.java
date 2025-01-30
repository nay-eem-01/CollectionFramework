package com.practice.StreamPractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamDemo {
    public static void main(String[] args) {

        List<Integer> listOfInteger = Arrays.asList(1,2,3,4,5,6);

        System.out.println(listOfInteger.stream().filter(x-> x%2 == 0).toList());

        List<String> listOfStrings = Arrays.asList("Nayeem","Hasib","Rakib","Babu","Sadid","Fantasir","Tamim");

        List<String> count = listOfStrings.stream().filter(s -> s.startsWith("N")).map(s-> s.replace("N","X")).toList();
        System.out.println(count);

        System.out.println(
                listOfStrings
                        .stream()
                        .sorted((a,b)-> b.length() - a.length())
                        .collect(Collectors.toList())
        );

        Stream<Integer> stream = listOfInteger.stream();

       // System.out.println(Stream.iterate(1,x->x+1).skip(20).limit(100).peek(System.out::println).count());

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Apple","Banana","Mango"),
                Arrays.asList("Red","Blue","green"),
                Arrays.asList("Rose","Belly","Lilly")
        );

        System.out.println(listOfLists);

        System.out.println(listOfLists.get(2).get(2));

        System.out.println(
                listOfLists
                        .stream()
                        .flatMap(Collection::stream)
                        .map(String::toUpperCase)
                        .toList()
        );

        List<String> sentences = Arrays.asList(
                "Hello world",
                "Java streams are powerful",
                "flatMap is useful"
        );

        System.out.println(
                sentences
                        .stream()
                        .flatMap(sentence-> Arrays.stream(sentence.split(" ")))
                        .map(String::toUpperCase)
                        .toList()

        );


    }
}
