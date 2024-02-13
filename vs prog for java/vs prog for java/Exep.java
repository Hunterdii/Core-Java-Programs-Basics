import java.util.*;
public class Exep{
public static void main(String []args){
    Scanner sin = new Scanner(System.in);
    System.out.println("Enter two numbers");
    System.out.print("First number: ");
    int a=sin.nextInt();
    System.out.print("Second number: ");
    int b=sin.nextInt();
    try {
        int result = a/b;
        System.out.println("Result is "+result);
        } catch (ArithmeticException e) {
            System.out.println("Error! Division by zero not allowed:" + e.getMessage());
            } finally {
                System.out.println("done....");
                }
    try {
            String str = null;
            System.out.println(str.length()); // This will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
        }
        }
