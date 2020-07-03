package be.vdab.books;

public class Author {

    // data fields
    private String name;
    private String email;
    private char gender;

    // constructors
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // getters & setters
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // toString method
    public String toString() {
        return "Author[name=" + getName() + ",email=" + getEmail() + ",gender=" + getGender() + "]";
    }
}
