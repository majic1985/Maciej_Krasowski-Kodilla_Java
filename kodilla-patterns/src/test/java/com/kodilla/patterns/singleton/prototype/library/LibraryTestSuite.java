package com.kodilla.patterns.singleton.prototype.library;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.books.add(new Book("The Book:" + n + ",", "author,", LocalDate.of((1985 + n), n, 1))));
        //When

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setLibraryName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setLibraryName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        deepCloneLibrary.books.add(new Book("Java.Podstawy wyd.X,", "Helion", LocalDate.of(2017,10,5)));

        //Then
        System.out.println(library.getName());
        library.books.stream().forEach(n -> System.out.println(n.getTitle() + " " + n.getAuthor() + " " + n.getPublicationDate()));

        System.out.println(cloneLibrary.getName());
        cloneLibrary.books.stream().forEach(n -> System.out.println(n.getTitle() + " " + n.getAuthor() + " " + n.getPublicationDate()));

        System.out.println(deepCloneLibrary.getName());
        deepCloneLibrary.books.stream().forEach(n -> System.out.println(n.getTitle() + " " + n.getAuthor() + " " + n.getPublicationDate()));

        Assert.assertEquals(10, library.books.size());
        Assert.assertEquals(10, cloneLibrary.books.size());
        Assert.assertEquals(11,deepCloneLibrary.books.size());
    }
}
