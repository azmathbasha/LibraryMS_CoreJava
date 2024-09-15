package edu.n2p.lms;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    private static Library single_instance = null;
 
    // Static method to create instance of Library class if there is no existing object
    public static Library getInstance()
    {
        if (single_instance == null)
            single_instance = new Library();
 
        return single_instance;
    }

    // Here we will be creating private constructor
    // restricted to this class itself
    private Library() {
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
