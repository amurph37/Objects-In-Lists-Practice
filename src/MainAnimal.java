import java.util.ArrayList;
import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the name of the animal (leave empty to stop): ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Is it a dog? (Yes/No): ");
            String isDogInput = scanner.nextLine();
            boolean isDog = isDogInput.equalsIgnoreCase("Yes");

            animals.add(new Animal(name, isDog));
        }

        System.out.println("Animals in the list:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
