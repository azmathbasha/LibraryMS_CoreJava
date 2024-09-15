package edu.n2p.lms;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String memberId;
    private String name;
    private List<Book> issuedBooks;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.issuedBooks = new ArrayList<>();
    }

    public String getDetails() {
        return "Member ID: " + memberId + ", Name: " + name;
    }

    public String getName() {
        return name;
    }
    
    public void issueBook(Book book) {
        if (!book.isIssued()) {
            book.issueBook();
            issuedBooks.add(book);
        } else {
            System.out.println("The book is already issued to someone else.");
        }
    }

    public void returnBook(Book book) {
        if (issuedBooks.contains(book)) {
            book.returnBook();
            issuedBooks.remove(book);
        } else {
            System.out.println("This member hasn't issued the book.");
        }
    }

    public void viewIssuedBooks() {
        if (issuedBooks.isEmpty()) {
            System.out.println("No books have been issued.");
        } else {
            System.out.println("Issued books:");
            for (Book book : issuedBooks) {
                System.out.println(book.getDetails());
            }
        }
    }
}
