package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //given
        Library library = new Library("Jagiellonska");
        Book book1 = new Book("First", "First", LocalDate.now());
        Book book2 = new Book("Second", "Second", LocalDate.now());
        Book book3 = new Book("Third", "Third", LocalDate.now());
        Set<Book> books = new HashSet<>();

        //when
        books.add(book1);
        books.add(book2);
        books.add(book3);

        library.setBooks(books);

        Library shallowCopyLibrary = null;
        Library deepCopyLibrary = null;

        try {
            shallowCopyLibrary = library.shallowCopy();
            shallowCopyLibrary.setName("Second");
        } catch (CloneNotSupportedException e) {
            System.out.println("Unable to shallow clone library");
        }

        try {
            deepCopyLibrary = library.deepCopy();
            deepCopyLibrary.setName("Third");
        } catch (CloneNotSupportedException e) {
            System.out.println("Unable to create deep coopy");
        }

        library.getBooks().remove(book1);

        //then
        Assert.assertEquals(false, shallowCopyLibrary.getBooks().contains(book1));
        Assert.assertEquals(2, shallowCopyLibrary.getBooks().size());

        Assert.assertEquals(library.getBooks(), shallowCopyLibrary.getBooks());
        Assert.assertEquals("Second", shallowCopyLibrary.getName());

        Assert.assertFalse(library.getBooks().size() == deepCopyLibrary.getBooks().size());
        Assert.assertEquals("Third", deepCopyLibrary.getName());
        Assert.assertEquals(true, deepCopyLibrary.getBooks().contains(book1));
    }
}
