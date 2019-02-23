package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;
import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;

public class ExceptionModuleRunner {

    public static void main (String args[]) {
        FileReaderWithoutHandling fileReader = new FileReaderWithoutHandling();

        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("File reader exception message");
        }

        SecondChallenge sc = new SecondChallenge();

        try {
            System.out.println(sc.probablyIWillThrowException(2 , 2));
        } catch (ExceptionHandling e) {
            System.out.println("SecondChallenge exception message " + e);
        }
    }
}
