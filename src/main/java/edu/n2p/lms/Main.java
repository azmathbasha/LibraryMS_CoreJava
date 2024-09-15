package edu.n2p.lms;

public class Main {
    public static void main(String[] args) {
        // Create Library instance
        Library library = new Library();

        // Create Books
        Book book1 = new Book("1", "Clean Code", "Robert C. Martin");
        Book book2 = new Book("2", "Modern Software Engineering", "David Farley");
        Book book3 = new Book("3", "Designing Data-Intensive Applications", "Martin Kleppman");
        Book book4 = new Book("4", "Clean Architecture", "Robert C. Martin");
        Book book5 = new Book("5", "Head First Java", "Kathy Sierra &Bert Bates");
        Book book6 = new Book("6", "Java 8 in Action", "Raoul-Gabriel Urma, Mario Fusco, and Alan Mycroft");
        Book book7 = new Book("7", "Head First Design Patterns", "Eric Freeman, Elisabeth Robson, Bert Bates, Kathy Sierra");

        // Add Books to the Library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);

        // Create Members
        Member member1 = new Member("101", "Ismail");
        Member member2 = new Member("102", "Imran");
        Member member3 = new Member("103", "Fatima");
        Member member4 = new Member("104", "Shakeel");

        // Add Members to the Library
        library.addMember(member1);
        library.addMember(member2);
        library.addMember(member3);
        library.addMember(member4);

        // Issue Books
        library.issueBook(book1, member1);
        library.issueBook(book2, member1);
        library.issueBook(book3, member2);
        library.issueBook(book4, member2);
        library.issueBook(book5, member3);
        library.issueBook(book6, member3);
        library.issueBook(book7, member4);

        // View Issued to Members
        System.out.println("Books issued to "+member1.getName()+" : ");
        member1.viewIssuedBooks();
        System.out.println("Books issued to "+member2.getName()+" : ");
        member1.viewIssuedBooks();
        System.out.println("Books issued to "+member3.getName()+" : ");
        member1.viewIssuedBooks();
        System.out.println("Books issued to "+member4.getName()+" : ");
        member1.viewIssuedBooks();

        // View Available Books
        library.listAvailableBooks();

        // View Issued Books in Library
        library.listIssuedBooks();

        // Return Book
        library.returnBook(book1, member1);
        library.returnBook(book3, member2);
        library.returnBook(book5, member3);
        library.returnBook(book6, member4);

        // View Available Books
        library.listAvailableBooks();

        // View Issued Books in Library
        library.listIssuedBooks();
    }
}
