package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
   public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
       ArrayList<Integer> list = new ArrayList<Integer>();

       for (Integer i : numbers){
           if (i % 2 == 0) {
               list.add(i);
           }
       }
       return list;
   }
}
