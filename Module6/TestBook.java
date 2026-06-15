// TestBook.java — tests the Book class
public class TestBook {
    public static void main(String[] args) {

        // Create two Book objects
        Book b1 = new Book("Clean Code", "Robert C. Martin", "978-0132350884", 35.99);
        b1.setPageCount(464);
        b1.setGenre("Technology");
        b1.setRating(4.8);

        Book b2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565", 12.99);
        b2.setPageCount(180);
        b2.setGenre("Fiction");
        b2.setRating(4.2);
        b2.setAvailable(false);

        // Test invalid inputs
        b1.setPrice(-10.0);       // should print error
        b1.setRating(6.0);        // should print error

        // Print all info
        b1.printInfo();
        b2.printInfo();

        // Test getters
        System.out.println("b1 title : " + b1.getTitle());
        System.out.println("b2 available: " + b2.isAvailable());
    }
}
