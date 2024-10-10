/// Create 2 classes as defined above.
/// In your program’s main method (let’s call it Library), create an author, a book and then print the book’s details.
/// Class Library will output: “Book <name> (<price> RON), by <author name>, published in <year>”
///
/// Alexandra-Elena Pribagu
/// 10.10.2024


package homeworks.h2_Library;

public class Library {

    public static void main(String[] args) {
        Author a = new Author();
        a.setName("Ina Garten");
        a.setEmail("info@barefootcontessa.com");

        a.printAuthor();

        Book b1 = new Book("Be Ready When the Luck Happens", 2024, a, 160);
        b1.printBook();
    }

}
