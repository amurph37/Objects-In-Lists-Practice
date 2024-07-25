public class Animal {
    private String name;
    private boolean isDog;

    // Constructor
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
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
