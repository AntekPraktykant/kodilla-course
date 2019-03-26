package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class GoodPatternsMain {
    public static void main(String[] args) {
        MovieStore ms = new MovieStore();

        System.out.println(ms.streamTheMapOfTitles());
    }
}
