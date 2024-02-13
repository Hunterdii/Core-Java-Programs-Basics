import java.util.Scanner;

public class WaterLevelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the current water level: ");
        int waterLevel = scanner.nextInt();
        
        if (waterLevel < 0) {
            System.out.println("Invalid water level.");
        } else if (waterLevel == 0) {
            System.out.println("The water level is empty.");
        } else if (waterLevel <= 50) {
            System.out.println("The water level is low.");
        } else if (waterLevel <= 75) {
            System.out.println("The water level is moderate.");
        } else {
            System.out.println("The water level is high.");
        }
        
        scanner.close();
    }
}
