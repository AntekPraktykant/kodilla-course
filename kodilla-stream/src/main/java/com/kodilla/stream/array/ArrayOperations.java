package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
   public static double getAverage(int[] numbers) {
       IntStream.range(0, numbers.length).forEach(System.out::println);
       double output = IntStream.range(0, numbers.length).average().orElse(-1);
       System.out.println(output);
       return output;
   }
}

