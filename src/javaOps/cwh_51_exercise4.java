// com.company package ko import kara
package javaOps;

// Library class banaya
class Library {
    // books array banaya
    String[] books;
    // kitne books available hai uska count rakha
    int no_of_books;

    // Library constructor banaya
    // Library constructor banaya
    Library() {
        // books array ko size 100 se initialize kiya
        this.books = new String[100];
        // no_of_books ko 0 se initialize kiya
        this.no_of_books = 0;
    }

    // book add karne wala method banaya
    void addBook(String book) {
        // books array ke no_of_books index pe book add kiya
        this.books[no_of_books] = book;
        // no_of_books ko 1 se increase kiya
        no_of_books++;
        // book added ka message print kiya
        System.out.println(book + " ko add kiya gaya hai!");
    }

    // available books show karne wala method banaya
    void showAvailableBooks() {
        // Available books ka message print kiya
        System.out.println("Available Books hai:");
        // books array pe loop chala ke null na mile
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            // book ka naam print kiya
            System.out.println("* " + book);
        }
    }

    // book issue karne wala method banaya
    void issueBook(String book) {
        // books array pe loop chala ke book exist karta hai ya nahi
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                // book issued ka message print kiya
                System.out.println("The book has been issued!");
                // books array ke us index pe null assign kiya
                this.books[i] = null;
                return;
            }
        }
        // book exist nahi karta to message print kiya
        System.out.println("Ye book exist nahi karti");
    }

    // book return karne wala method banaya
    void returnBook(String book) {
        // book add karne wala method ko call kiya
        addBook(book);
    }
}

// cwh_51_exercise4 class banaya
public class cwh_51_exercise4 {
    // main method banaya
    public static void main(String[] args) {
// Aapko ek Library implement karni hai Java class "Library" ka use karke
// Methods: addBook, issueBook, returnBook, showAvailableBooks
// Properties: Array to store the available books,
// Array to store the issued books

        // Library object centralLibrary banaya
        Library centralLibrary = new Library();
        // Kuch books add kiye
        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("C++");
        // Available books show kiye
        centralLibrary.showAvailableBooks();

        // Book issue kiya
        centralLibrary.issueBook("C++");
        // Available books show kiye
        centralLibrary.showAvailableBooks();

        // Book return kiya
        centralLibrary.returnBook("C++");
        // Available books show kiye
        centralLibrary.showAvailableBooks();
    }
}
