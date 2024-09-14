package edu.n2p.lms;

public class Main {
    public static void main(String[] args) {
        // Create Library instance
        Library library = new Library();

        // Create Books
        Book book1 = new Book("1", "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("2", "1984", "George Orwell");
        Book book3 = new Book("3", "To Kill a Mockingbird", "Harper Lee");

        // Add Books to the Library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Create Members
        Member member1 = new Member("101", "Alice");
        Member member2 = new Member("102", "Bob");

        // Add Members to the Library
        library.addMember(member1);
        library.addMember(member2);

        // Issue Books
        library.issueBook(book1, member1);
        library.issueBook(book2, member1);

        // View Issued Books by Alice
        System.out.println("Books issued by Alice:");
        member1.viewIssuedBooks();

        // Return Book
        library.returnBook(book1, member1);

        // View Available Books
        library.listAvailableBooks();

        // View Issued Books in Library
        library.listIssuedBooks();
    }
}
