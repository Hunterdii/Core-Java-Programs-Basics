public class SimpleMethodOverloading {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        SimpleMethodOverloading obj = new SimpleMethodOverloading();

        // Calling the different overloaded methods
        int sum1 = obj.add(2, 3);
        int sum2 = obj.add(4, 5, 6);
        double sum3 = obj.add(1.5, 2.5);

        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of three integers: " + sum2);
        System.out.println("Sum of two doubles: " + sum3);
    }
}
