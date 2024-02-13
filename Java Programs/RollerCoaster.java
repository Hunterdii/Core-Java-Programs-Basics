import java.util.Scanner;

public class RollerCoaster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height (in cm): ");
        int height = scanner.nextInt();

        if (height >= 120) {
            System.out.print("Enter the age: ");
            int age = scanner.nextInt();
            int totalPrice = 0;

            if (age >= 18) {
                System.out.println("Please pay $10");
                totalPrice = 10;
            } else if (age >= 11 && age <= 18) {
                System.out.println("Please pay $7");
                totalPrice = 7;
            } else if (age < 11) {
                System.out.println("Please pay $5");
                totalPrice = 5;
            }

            System.out.print("Do you want to take photos? (yes/no): ");
            String takePhotos = scanner.next();

            if (takePhotos.equalsIgnoreCase("yes")) {
                System.out.println("Additional $3 will be added for photos.");
                totalPrice += 3;
            }

            System.out.println("Total Price: $" + totalPrice);
        } else {
            System.out.println("You cannot ride the roller coaster.");
        }

        scanner.close();
    }
}