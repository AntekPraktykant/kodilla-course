package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOf0() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        resultListOf0Books = generateListOfNBooks(0);
        LibraryUser user0 = new LibraryUser("user0", "user0", "0");

        when(libraryDatabaseMock.listBooksInHandsOf(user0)).thenReturn(resultListOf0Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksInHandsOf(user0);

        // Then
        assertEquals(0, theListOfBooks0.size());
    }

    @Test
    public void testListBooksInHandsOf1() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
//        List<Book> resultListOf0Books = new ArrayList<Book>();
        LibraryUser user1 = new LibraryUser("user1", "user1", "1");
        LibraryUser user5 = new LibraryUser("user5", "user5", "5");
        List<Book> resultListOf1Books = generateListOfNBooks(1);
        List<Book> resultListOf5Books = generateListOfNBooks(5);

        when(libraryDatabaseMock.listBooksInHandsOf(user1))
                .thenReturn(resultListOf1Books);
        when(libraryDatabaseMock.listBooksInHandsOf(user5))
                .thenReturn(resultListOf5Books);

        // When
        List<Book> theListOfBooks1 = bookLibrary.listBooksInHandsOf(user1);
        List<Book> theListOfBooks5 = bookLibrary.listBooksInHandsOf(user5);

        // Then
        assertEquals(1, theListOfBooks1.size());
        assertEquals(5, theListOfBooks5.size());
    }

    @Test
    public void testListBooksInHandsOf5() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf5Books = generateListOfNBooks(5);
//Dlaczego takie podejście nie działa?        LibraryUser userX = new LibraryUser(anyString(),anyString(), anyString());
        LibraryUser userX = new LibraryUser("a", "a", "b");
//        userX.setBooks(resultListOf5Books);
        when(libraryDatabaseMock.listBooksInHandsOf(userX))
                .thenReturn(resultListOf5Books);

        // When
        List<Book> theListOfBooks5 = bookLibrary.listBooksInHandsOf(userX);

        // Then
        assertEquals(5, theListOfBooks5.size());
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(userX);
    }
}