package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    public String name;
    public Set<Book> books = new HashSet();

    public Library( String name ) {
        this.name = name;
    }

    public void setLibraryName( String name ) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = this.shallowCopy();
        clonedLibrary.books = new HashSet();
        this.books.stream().forEach(( n ) -> {
            clonedLibrary.books.add(new Book(n.title, n.author, n.publicationDate));
        });
        return clonedLibrary;
    }
}
