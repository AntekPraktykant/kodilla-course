package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        BookDirectory theBookDirectory = new BookDirectory();

        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);

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
            String g = new String(a);
            return g;
        }));
        System.out.println(pb.beautify("First verse but not second one", (s)-> {
            return s.replaceAll("[ ][v]", "-V");
        }));
    }

    Forum forum = new Forum();
//    Map<>

}