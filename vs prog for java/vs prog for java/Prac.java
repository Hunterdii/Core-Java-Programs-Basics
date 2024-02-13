import java.util.*;

public class Prac{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of degree: ");
        float temperature = sc.nextFloat();
        if(temperature < 30 && temperature > 0)
        System.out.println("It is a good day to go out and play");
        else if(temperature > 30 && temperature < 50)
        System.out.println("It is a hot day, better stay at home");
        else
        System.out.println("It is cold today, you should wear warm clothes");
    }
}