public class Book {
    private String title;
    private int numberOfPages;
    private int publicationYear;

    // Constructor with all parameters
    public Book(String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    // Constructor with title and numberOfPages, defaults publicationYear
    public Book(String title, int numberOfPages) {
        this(title, numberOfPages, 0);
    }

    // Default constructor
    public Book() {
        this("Untitled", 0, 0);
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return getTitle() + ", " + getNumberOfPages() + " pages, " + getPublicationYear();
    }
}
