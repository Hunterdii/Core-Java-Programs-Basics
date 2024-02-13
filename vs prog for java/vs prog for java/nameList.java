import java.util.*;

public class nameList{
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Give the names separated by ,");
        String names = scanner.nextLine();
        String[] nameArray = names.split(",");
        List<String> nameList= Arrays.asList(nameArray);
        System.out.println(nameList);

        Random random = new Random();
        String Who = nameList.get(random.nextInt(nameList.size()));
        System.out.print(Who+ " is going to pay the bill");
        scanner.close();
}
}