
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String longestName = "";
        int longestNameLength = 0;
        ArrayList<Integer> birthYears = new ArrayList<>();
        int count = 0;


        while (true) {
            String input = scanner.nextLine();


            if (input.isEmpty()) {
                break;
            }


            String[] parts = input.split(",");


            if (parts.length == 2) {
                String name = parts[0];
                int birthYear = Integer.parseInt(parts[1]);


                if (name.length() > longestNameLength) {
                    longestNameLength = name.length();
                    longestName = name;
                }


                birthYears.add(birthYear);
                count++;
            }
        }


        if (count > 0) {

            double totalBirthYear = 0;
            for (int year : birthYears) {
                totalBirthYear += year;
            }
            double averageBirthYear = totalBirthYear / count;


            System.out.println("Longest name: " + longestName);
            System.out.println("Average birth year: " + averageBirthYear);
        }
    }
}
