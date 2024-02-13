import java.util.*;

public class Cal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Welcome to calculator: ");
            System.out.println("Enter two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Choose Operation:");
            System.out.println("1 for Addition");
            System.out.println("2 for Subtraction");
            System.out.println("3 for Multiplication");
            System.out.println("4 for Division");
            System.out.println("5 to Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Addition is: " + (a + b));
                    break;
                case 2:
                    System.out.println("Subtraction is: " + (a - b));
                    break;
                case 3:
                    System.out.println("Multiplication is: " + (a * b));
                    break;
                case 4:
                    if (b != 0)
                        System.out.println("Division is: " + (a / b));
                    else
                        System.out.println("Cannot divide by zero");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 5);
    }
}