package com.practice.PracticeOfMap;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new ConcurrentHashMap<>();


        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                map1.put(i,"Thread 1");
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 1000; i < 2000; i++) {
                map1.put(i,"Thread 2");
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        Map<Day,String> map2 = new EnumMap<>(Day.class);

        map2.put(Day.SATURDAY,"Start of the week");
        map2.put(Day.SUNDAY,"Busy day");
        map2.put(Day.MONDAY,"Boring Day");
        map2.put(Day.TUESDAY,"Lot of work to do ");
        map2.put(Day.WEDNESDAY,"Gotta meet my friends at caffe");
        map2.put(Day.THURSDAY,"Weekend");
        map2.put(Day.FRIDAY,"YAYYYYYY, OFF day");

       // System.out.println(map1.size());

        map2.forEach((day, s) -> System.out.println(day + ":-\t" + s));

    }

  public enum Day{
      SATURDAY,SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY
  }
}
