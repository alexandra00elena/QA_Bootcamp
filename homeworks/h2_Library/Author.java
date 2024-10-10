/// Create a class Author with following attributes and methods
/// name:String                 +Author(name:String, email:String)
/// email:String                +getName():String
///                             +getEmail():String
///
/// Alexandra-Elena Pribagu
/// 10.10.2024


package homeworks.h2_Library;

public class Author {

    private String name;
    private String email;

    public Author() {}

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printAuthor() {
        System.out.println("Contact " + this.name + " at " + this.email);
    }

}
