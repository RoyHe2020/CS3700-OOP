// Book.java — Module 6 Assignment 2
// Implements the Book class based on UML design

public class Book {

    // ── Attributes (all private) ──────────────────────────────────────────────
    private String title;
    private String author;
    private String isbn;
    private double price;
    private int pageCount;
    private String genre;
    private boolean isAvailable;
    private double rating;

    // ── Constructor ───────────────────────────────────────────────────────────
    public Book(String title, String author, String isbn, double price) {
        this.title       = title;
        this.author      = author;
        this.isbn        = isbn;
        this.pageCount   = 0;
        this.genre       = "Unknown";
        this.isAvailable = true;
        this.rating      = 0.0;
        setPrice(price);   // use setter to validate
    }

    // ── Getters ───────────────────────────────────────────────────────────────
    public String getTitle()    { return title; }
    public String getAuthor()   { return author; }
    public String getIsbn()     { return isbn; }
    public double getPrice()    { return price; }
    public int    getPageCount(){ return pageCount; }
    public String getGenre()    { return genre; }
    public double getRating()   { return rating; }
    public boolean isAvailable(){ return isAvailable; }

    // ── Setters (with validation) ─────────────────────────────────────────────
    public void setPrice(double price) {
        if (price >= 0)
            this.price = price;
        else
            System.out.println("Error: price cannot be negative.");
    }

    public void setPageCount(int pageCount) {
        if (pageCount > 0)
            this.pageCount = pageCount;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAvailable(boolean flag) {
        this.isAvailable = flag;
    }

    public void setRating(double rating) {
        if (rating >= 0.0 && rating <= 5.0)
            this.rating = rating;
        else
            System.out.println("Error: rating must be between 0.0 and 5.0.");
    }

    // ── printInfo: display all book details ───────────────────────────────────
    public void printInfo() {
        System.out.println("========================================");
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("ISBN      : " + isbn);
        System.out.printf( "Price     : $%.2f%n", price);
        System.out.println("Pages     : " + pageCount);
        System.out.println("Genre     : " + genre);
        System.out.printf( "Rating    : %.1f / 5.0%n", rating);
        System.out.println("Available : " + (isAvailable ? "Yes" : "No"));
        System.out.println("========================================");
    }
}
