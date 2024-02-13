import java.util.Scanner;

public class If_cond {

    public static void main(String[] args) {
        int pwd;
        System.out.println("Enter PASSword:");
        Scanner sc=new Scanner(System.in);
        pwd=sc.nextInt();
        if (pwd==2543) 
        {
            System.out.println("Enter Password is correct");
            System.out.println("name=HET");
            System.out.println("age:=18");
            }
            else
            {
                System.out.println("Enter Password is incorrect");
                }
        }
    }
