public class TvShow {
    private String showName;
    private int numberOfEpisodes;
    private String genre;

    // Constructor with all parameters
    public TvShow(String showName, int numberOfEpisodes, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    // Constructor with showName and numberOfEpisodes, defaults genre
    public TvShow(String showName, int numberOfEpisodes) {
        this(showName, numberOfEpisodes, "Unknown");
    }

    // Default constructor
    public TvShow() {
        this("Unnamed Show", 0, "Unknown");
    }

    // Getters
    public String getShowName() {
        return showName;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "The Name of the show is " + getShowName() + " with " + getNumberOfEpisodes() + " number of episodes. The genre is " + getGenre();
    }
}
