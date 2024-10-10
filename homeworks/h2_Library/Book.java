/// Create a class Book with following attributes and methods
/// name:String                     +Book(name:String, year:int, author:Author, price:double)
/// year:int                        +getName():String
/// author:Author                   +getAuthor():Author
/// price:double                    +getPrice():double
///                                 +getYear():int
///
/// Alexandra-Elena Pribagu
/// 10.10.2024


package homeworks.h2_Library;

public class Book {
    private String name;
    private int year;
    private Author author;
    private double price;

    Book() {}

    Book(String name, int year, Author author, double price) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void printBook() {
        System.out.println("Book '" + this.name + "'(" + this.price + " RON), by " +
                this.author.getName() + ", published in " + this.year);
    }

}
