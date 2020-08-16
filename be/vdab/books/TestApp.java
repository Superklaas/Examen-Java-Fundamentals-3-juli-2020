package be.vdab.books;

public class TestApp {
    public static void main(String[] args) {

        // new objects
        Author willemElsschot = new Author("Willem Elsschot", "willie@icloud.com", 'M');
        Book villaDesRoses = new Book("Villa Des Roses", willemElsschot, 20, 2);

        // test toString
        System.out.println("TEST TOSTRING METHOD");
        System.out.println(willemElsschot.toString());
        System.out.println(villaDesRoses.toString());

        //test getters & setters author
        System.out.println("\nTEST GETTERS & SETTERS AUTHOR");
        System.out.println(willemElsschot.getName());
        System.out.println(willemElsschot.getEmail());
        willemElsschot.setEmail("billie@icloud.com");
        System.out.println(willemElsschot.getEmail());
        System.out.println(willemElsschot.getGender());

        //test getters & setters book
        System.out.println("\nTEST GETTERS & SETTERS BOOK");
        System.out.println(villaDesRoses.getName());
        System.out.println(villaDesRoses.getAuthor());
        System.out.println(villaDesRoses.getPrice());
        villaDesRoses.setPrice(25);
        System.out.println(villaDesRoses.getPrice());
        System.out.println(villaDesRoses.getQty());
        villaDesRoses.setQty(45);
        System.out.println(villaDesRoses.getQty());

    }
}
