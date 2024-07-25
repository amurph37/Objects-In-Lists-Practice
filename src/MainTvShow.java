import java.util.ArrayList;
import java.util.Scanner;

public class MainTvShow {
    public static void main(String[] args) {
        ArrayList<TvShow> tvShows = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the name of the TV show (leave empty to stop): ");
            String showName = scanner.nextLine();
            if (showName.isEmpty()) {
                break;
            }
            System.out.print("How Many episodes? ");
            int numberOfEpisodes = Integer.parseInt(scanner.nextLine());
            System.out.print("What is the genre? ");
            String genre = scanner.nextLine();

            tvShows.add(new TvShow(showName, numberOfEpisodes, genre));
        }

        System.out.println("TV shows in the list:");
        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow);
        }
    }
}
