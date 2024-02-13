import java.util.Scanner;
public class Else_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Marks: ");
        int marks = scanner.nextInt();
    if(marks>=80 && marks<=100)
    {
        System.out.println("first division");
    }
    else if(marks>=40 && marks<=80)
    {
        System.out.println("pass");
    }
    else
    {
        System.out.println("fail");
    }
    }
}
