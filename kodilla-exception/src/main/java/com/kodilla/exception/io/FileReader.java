package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile() {

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/names.txt").getFile());
        String imp = "";
//        Path path = Paths.get(file.getPath() + imp);
        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath() + imp))) {
//        try {
//            Stream<String> fileLines = Files.lines(path);
            fileLines.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("Oh no, destruction! " + e);
        } finally {
            System.out.println("I am gonna be here... always");
        }

        System.out.println(file.getAbsolutePath());
    }
}
