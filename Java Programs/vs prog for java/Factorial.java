public class Factorial {
    public static void main(String[] args) {
        int number = 5; // The number to calculate the factorial of
        
        long factorial = calculateFactorial(number);
        
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
    
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        }
        
        long factorial = 1;
        
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
