import java.util.Arrays;
import java.util.List;
import java.util.*;

public class name {
    public static void main(String[] args) {
        String names = "Het, Khushi, Phusti, Jatin, Charmi, Kriya";
        String[] nameArray = names.split(",");
        List<String> nameList = Arrays.asList(nameArray);

        System.out.println(nameList);
        
    }
}