import java.util.Scanner;
import java.util.Arrays;

public class heigh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a list of student height (in cm): ");
        String height = scanner.nextLine();

        String[] heightStrings = height.split(",");
        int[] heights = new int[heightStrings.length];

        for (int index =0; index < heightStrings.length; index++){
            heights[index] = Integer.parseInt(heightStrings[index]);
        }
        System.out.println(Arrays.toString(heights));
        scanner.close();


    }

}
