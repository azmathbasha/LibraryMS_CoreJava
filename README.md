# Library Management System

## Overview

This project is a simple Library Management System built using Java, designed to showcase Object-Oriented Programming (OOP) concepts. The system allows basic operations such as managing books, members, and issuing or returning books.

### Features

* Add books to the library
* Register members
* Issue and return books
* View available and issued books

### Tech Stack

* **Java** for the core development

## Project Structure

The project follows the typical Maven structure:

<pre class="!overflow-visible"><div class="dark bg-gray-950 contain-inline-size rounded-md border-[0.5px] border-token-border-medium relative"></span></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-css">LibraryManagementSystem/
├── <span class="hljs-attribute">src</span>
│   ├── <span class="hljs-selector-tag">main</span>
│   │   └── java
│   │       └── edu
│   │           └── n2p
│   │               └── lms
│   │                   ├── Book<span class="hljs-selector-class">.java</span>
│   │                   ├── Member<span class="hljs-selector-class">.java</span>
│   │                   ├── Library<span class="hljs-selector-class">.java</span>
│   │                   └── <span class="hljs-selector-tag">Main</span><span class="hljs-selector-class">.java</span>
│   └── test
└── ...
</code></div></div></pre>

### Package

All the core classes are placed under the package** **`edu.n2p.lms`.

## Class Descriptions

1. **Book.java**
   * Attributes:** **`bookId`,** **`title`,** **`author`,** **`isIssued`
   * Methods:** **`getDetails()`,** **`issueBook()`,** **`returnBook()`
2. **Member.java**
   * Attributes:** **`memberId`,** **`name`,** **`issuedBooks[]`
   * Methods:** **`issueBook()`,** **`returnBook()`,** **`viewIssuedBooks()`
3. **Library.java**
   * Attributes:** **`books[]`,** **`members[]`
   * Methods:** **`addBook()`,** **`addMember()`,** **`issueBook()`,** **`returnBook()`,** **`listAvailableBooks()`,** **`listIssuedBooks()`
4. **Main.java**
   * The main entry point, where you can interact with the** **`Library`,** **`Book`, and** **`Member`** **classes.

## How to Run

### Prerequisites

* Java 11 or later

### Steps:

1. Clone the repository:

   <pre class="!overflow-visible"><div class="dark bg-gray-950 contain-inline-size rounded-md border-[0.5px] border-token-border-medium relative"><div class="flex items-center text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md h-9">bash</div><div class="sticky top-9 md:top-[5.75rem]"><div class="absolute bottom-0 right-2 flex h-9 items-center"><div class="flex items-center rounded bg-token-main-surface-secondary px-2 font-sans text-xs text-token-text-secondary"><span class="" data-state="closed"></span></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-bash">git <span class="hljs-built_in">clone</span> https://github.com/azmathbasha/LibraryMS_CoreJava.git
   </code></div></div></pre>
2. Navigate to the project directory:

   <pre class="!overflow-visible"><div class="dark bg-gray-950 contain-inline-size rounded-md border-[0.5px] border-token-border-medium relative"><div class="flex items-center text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md h-9">bash</div><div class="sticky top-9 md:top-[5.75rem]"><div class="absolute bottom-0 right-2 flex h-9 items-center"><div class="flex items-center rounded bg-token-main-surface-secondary px-2 font-sans text-xs text-token-text-secondary"><span class="" data-state="closed"></span></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-bash"><span class="hljs-built_in">cd</span> LibraryMS_CoreJava/src/main/java
   </code></div></div></pre>
3. Build the project:

   <pre class="!overflow-visible"><div class="dark bg-gray-950 contain-inline-size rounded-md border-[0.5px] border-token-border-medium relative"><div class="flex items-center text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md h-9">bash</div><div class="sticky top-9 md:top-[5.75rem]"><div class="absolute bottom-0 right-2 flex h-9 items-center"><div class="flex items-center rounded bg-token-main-surface-secondary px-2 font-sans text-xs text-token-text-secondary"><span class="" data-state="closed"></span></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-bash">javac edu/n2p/lms/*.java
   </code></div></div></pre>
4. Run the application:

   <pre class="!overflow-visible"><div class="dark bg-gray-950 contain-inline-size rounded-md border-[0.5px] border-token-border-medium relative"><div class="flex items-center text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md h-9">bash</div><div class="sticky top-9 md:top-[5.75rem]"><div class="absolute bottom-0 right-2 flex h-9 items-center"><div class="flex items-center rounded bg-token-main-surface-secondary px-2 font-sans text-xs text-token-text-secondary"><span class="" data-state="closed"></span></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-bash">java edu.n2p.lms.Main
   </code></div></div></pre>

## Future Improvements

* Add a late return fine system
* Implement a graphical user interface
* Integrate a database to store book/member data
* Add search functionality for books by title or autho
