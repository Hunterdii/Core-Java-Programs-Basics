import java.util.*;


public class usa3 {

public static void main(String[] args) {
        ArrayList<String> usa = new ArrayList<>(Arrays.asList(
                "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania"
        ));
        System.out.println("State of USA before: " + usa);

        List<String> newStates = Arrays.asList(
                "California","Florida", "Georgia", "Hawaii"
        );

        usa.addAll(newStates);
        System.out.println("State of USA after: " + usa);
}
}
