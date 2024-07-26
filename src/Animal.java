public class Animal {
    private String name;
    private boolean isDog;

    // Constructor with both parameters
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    // Constructor with only name, defaults to not a dog
    public Animal(String name) {
        this(name, false);
    }

    // Default constructor, no name and not a dog
    public Animal() {
        this("Unnamed", false);
    }

    // Getters
    public String getName() {
        return name;
    }

    public boolean getIsDog() {
        return isDog;
    }

    @Override
    public String toString() {
        return getName() + " is a Dog = " + getIsDog();
    }
}
