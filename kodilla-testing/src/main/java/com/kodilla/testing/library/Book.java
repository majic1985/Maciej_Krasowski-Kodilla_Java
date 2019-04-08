package com.kodilla.testing.library;

public class Book {
    String title;
    String author;
    int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return "Book{title='" + this.title + '\'' + ", author='" + this.author + '\'' + ", publicationYear=" + this.publicationYear + '}';
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Book)) {
            return false;
        } else {
            Book book = (Book)o;
            if (this.publicationYear != book.publicationYear) {
                return false;
            } else {
                return !this.title.equals(book.title) ? false : this.author.equals(book.author);
            }
        }
    }

    public int hashCode() {
        int result = this.title.hashCode();
        result = 31 * result + this.author.hashCode();
        result = 31 * result + this.publicationYear;
        return result;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }
}


