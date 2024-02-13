import java.util.*;

public class usa2 {
    public static void main(String[] args) {
        List<String> allStates = Arrays.asList(
            "Alabama",
            "Alaska",
            "Arizona",
            "Arkansas",
            "California",
            "Colorado",
            "Connecticut",
            "Delaware",
            "Florida",
            "Georgia",
            "Hawaii",
            "Idaho",
            "Illinois",
            "Indiana",
            "Iowa",
            "Kansas",
            "Kentucky",
            "Louisiana",
            "Maine",
            "Maryland",
            "Massachusetts",
            "Michigan",
            "Minnesota",
            "Mississippi",
            "Missouri",
            "Montana",
            "Nebraska",
            "Nevada",
            "New Hampshire",
            "New Jersey",
            "New Mexico",
            "New York"
        
        );
        ArrayList<String> usa = new ArrayList<>(allStates);
        System.out.println(usa);
        System.out.println("State Joined first: " + usa.get(0));
        System.out.println("State Joined second: " + usa.get(1));
        System.out.println("State Joined last: " + usa.get(usa.size() - 1));
    }
}
