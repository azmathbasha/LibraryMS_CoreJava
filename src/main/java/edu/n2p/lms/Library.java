package edu.n2p.lms;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getDetails());
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Added member: " + member.getDetails());
    }

    public void issueBook(Book book, Member member) {
        member.issueBook(book);
    }

    public void returnBook(Book book, Member member) {
        member.returnBook(book);
    }

    public void listAvailableBooks() {
        System.out.println("Available books:");
        for (Book book : books) {
            if (!book.isIssued()) {
                System.out.println(book.getDetails());
            }
        }
    }

    public void listIssuedBooks() {
        System.out.println("Issued books:");
        for (Book book : books) {
            if (book.isIssued()) {
                System.out.println(book.getDetails());
            }
        }
    }
}
