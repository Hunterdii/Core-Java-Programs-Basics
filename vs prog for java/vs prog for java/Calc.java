import java.util.*;

public class Calc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to calculator: ");
        System.out.println("Enter two no:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Choose Operation:");
        System.out.println("1 for Addition");
        System.out.println("2 for Subtraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Division");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 :
            System.out.println("Addition is :"+(a+b));
            break;
            case 2 :
            System.out.println("Substraction is :" +(a-b));
            break;
            case 3 :
            System.out.println("Multiplication is :"+(a*b));
            break;
            case 4 :
            if(b!=0)
            System.out.println("Division is :"+(a/b));
            break;
            default :
            System.out.println("Invalid Choice!");
            }
        }
    }