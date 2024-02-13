import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();
        try {
            int result = number1 / number2;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}