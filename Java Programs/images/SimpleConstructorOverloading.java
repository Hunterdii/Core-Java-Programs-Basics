public class SimpleConstructorOverloading {

    private int value1;
    private int value2;

    // Constructor with no parameters
    public SimpleConstructorOverloading() {
        value1 = 0;
        value2 = 0;
    }

    // Constructor with one parameter
    public SimpleConstructorOverloading(int value) {
        value1 = value;
        value2 = 0;
    }

    // Constructor with two parameters
    public SimpleConstructorOverloading(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void displayValues() {
        System.out.println("Value 1: " + value1);
        System.out.println("Value 2: " + value2);
    }

    public static void main(String[] args) {
        // Using different constructors to create objects
        SimpleConstructorOverloading obj1 = new SimpleConstructorOverloading();
        SimpleConstructorOverloading obj2 = new SimpleConstructorOverloading(10);
        SimpleConstructorOverloading obj3 = new SimpleConstructorOverloading(20, 30);

        System.out.println("Object 1:");
        obj1.displayValues();

        System.out.println("Object 2:");
        obj2.displayValues();

        System.out.println("Object 3:");
        obj3.displayValues();
    }
}
