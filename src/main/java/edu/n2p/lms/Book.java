package edu.n2p.lms;

import java.util.Date;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private boolean isIssued;
    private Date issueDate;
    private Date returnDate;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public String getDetails() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author;
    }

    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            issueDate = new Date();
            System.out.println("Book '" + title + "' has been issued.");
        } else {
            System.out.println("Book '" + title + "' is already issued.");
        }
    }

    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            returnDate = new Date();
            System.out.println("Book '" + title + "' has been returned.");
        } else {
            System.out.println("Book '" + title + "' was not issued.");
        }
    }

    public boolean isIssued() {
        return isIssued;
    }
}
