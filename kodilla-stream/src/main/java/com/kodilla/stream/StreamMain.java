package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.lang.reflect.Array;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier pb = new PoemBeautifier();

        System.out.println(pb.beautify("First verse", (s)-> s + ", second verse"));
        System.out.println(pb.beautify("First verse", (s)-> s.toUpperCase()));
        System.out.println(pb.beautify("First verse", (s)-> {

            char[] a = s.toCharArray();
            for (int i = 0; i < a.length; i++) {
                if (a[i] == 's') {
                    a[i] = 'S';
                }
            }
//Dlaczego dodanie a.toString() generuje dziwaczny wynik ? :)
            System.out.println(a);
            return a.toString();
        }));
        System.out.println(pb.beautify("First verse but not second one", (s)-> {
            return s.replaceAll("[ ][v]", "-V");
        }));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
