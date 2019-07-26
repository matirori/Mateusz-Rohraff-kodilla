package com.kodilla.patterns.singleton.com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Biblioteka");
        Book book = new Book("50 Shades od Gray", "J.K. Rowling", LocalDate.of(1997,9,25));
        Book book1 = new Book("King Lion", "J.K. Rowling", LocalDate.of(1997,9,25));
        Book book2 = new Book("Harry Potter", "J.K. Rowling", LocalDate.of(1997,9,25));
        Book book3 = new Book("olishdgfl;kj;", "J.K. Rowling", LocalDate.of(1997,9,25));

        library.getBooks().add(book);
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //making shalow Copy
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Bibliotek 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making deep copy of Library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Biblioteka 3");
        } catch (CloneNotSupportedException e ) {
            System.out.println(e);
        }

        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepClonedLibrary);
        //When
        library.getBooks().remove(book);
        library.getBooks().remove(book1);
        library.getBooks().remove(book2);
        library.getBooks().remove(book3);

        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepClonedLibrary);

        //Then
        Assert.assertEquals( 0, library.getBooks().size());
        Assert.assertEquals(0, cloneLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
    }
}
