import java.util.ArrayList;
import java.util.Scanner;

public class MainBook {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the title of the book (leave empty to stop): ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Enter the number of pages: ");
            int numberOfPages = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, numberOfPages, publicationYear));
        }

        System.out.print("What information would you like to print? (everything/name): ");
        String choice = scanner.nextLine();

        if (choice.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (choice.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }
    }
}
