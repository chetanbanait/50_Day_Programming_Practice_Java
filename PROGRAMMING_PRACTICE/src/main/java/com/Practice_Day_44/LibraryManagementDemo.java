package com.Practice_Day_44;

class LibraryBook {

    String bookName;
    boolean available = true;

    LibraryBook(String bookName) {
        this.bookName = bookName;
    }

    void issueBook() {

        if (available) {
            available = false;
            System.out.println(bookName + " issued");
        } else {
            System.out.println(bookName + " not available");
        }
    }

    void returnBook() {
        available = true;
        System.out.println(bookName + " returned");
    }
}

public class LibraryManagementDemo {
    public static void main(String[] args) {

        LibraryBook book =
                new LibraryBook("Java Programming");

        book.issueBook();
        book.issueBook();
        book.returnBook();
        book.issueBook();
    }
}