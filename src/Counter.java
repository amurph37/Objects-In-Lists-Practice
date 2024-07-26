public class Counter {
    private int value;

    // Constructor with start value
    public Counter(int startValue) {
        this.value = startValue;
    }

    // Default constructor with value 0
    public Counter() {
        this(0);
    }

    // Method to get the current value
    public int value() {
        return this.value;
    }

    // Method to increase the value by 1
    public void increase() {
        this.value++;
    }

    // Method to decrease the value by 1
    public void decrease() {
        this.value--;
    }

    // Overloaded method to increase by a specific value
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.value += increaseBy;
        }
    }

    // Overloaded method to decrease by a specific value
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.value -= decreaseBy;
        }
    }

    @Override
    public String toString() {
        return "Counter[value=" + value + "]";
    }
}
