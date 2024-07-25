public class TvShow {
    private String showName;
    private int numberOfEpisodes;
    private String genre;

    // Constructor
    public TvShow(String showName, int numberOfEpisodes, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
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
