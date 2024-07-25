public class Book {
    private String title;
    private int numberOfPages;
    private int publicationYear;

    // Constructor
    public Book(String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
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
