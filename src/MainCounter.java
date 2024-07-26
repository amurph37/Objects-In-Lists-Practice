public class MainCounter {
    public static void main(String[] args) {
        // Using constructors
        Counter counter1 = new Counter(10);
        Counter counter2 = new Counter();

        // Using methods
        System.out.println("Initial counter values:");
        System.out.println("Counter 1: " + counter1);
        System.out.println("Counter 2: " + counter2);

        counter1.increase();
        counter2.increase();
        System.out.println("After increasing by 1:");
        System.out.println("Counter 1: " + counter1);
        System.out.println("Counter 2: " + counter2);

        counter1.decrease();
        counter2.decrease();
        System.out.println("After decreasing by 1:");
        System.out.println("Counter 1: " + counter1);
        System.out.println("Counter 2: " + counter2);

        counter1.increase(5);
        counter2.increase(3);
        System.out.println("After increasing by specific values:");
        System.out.println("Counter 1: " + counter1);
        System.out.println("Counter 2: " + counter2);

        counter1.decrease(2);
        counter2.decrease(1);
        System.out.println("After decreasing by specific values:");
        System.out.println("Counter 1: " + counter1);
        System.out.println("Counter 2: " + counter2);
    }
}
