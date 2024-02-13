import java.util.Scanner;
import java.util.ArrayList;

public class Operations {
    static ArrayList<Integer> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Add element");
            System.out.println("2. Remove element");
            System.out.println("3. Display elements");
            System.out.println("4. Calculate sum of all elements");
            System.out.println("5. Calculate average of all elements");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addElement();
                    break;
                case 2:
                    removeElement();
                    break;
                case 3:
                    displayElements();
                    break;
                case 4:
                    sumOfAllElements();
                    break;
                case 5:
                    averageOfAllElements();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);
    }

    private static void addElement() {
        System.out.println("Enter the element to be added: ");
        int element = sc.nextInt();
        list.add(element);
    }

    private static void removeElement() {
        System.out.println("Enter the index of the element to be removed: ");
        int index = sc.nextInt();
        if (index >= 0 && index < list.size()) {
            list.remove(index);
            System.out.println("Element removed.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    private static void displayElements() {
        System.out.println("Elements in the list: ");
        for (int element : list) {
            System.out.println(element);
        }
    }

    private static void sumOfAllElements() {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("Sum of all elements: " + sum);
    }

    private static void averageOfAllElements() {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        if (list.size() > 0) {
            double average = (double) sum / list.size();
            System.out.println("Average of all elements: " + average);
        } else {
            System.out.println("List is empty. Cannot calculate average.");
        }
    }
}
