
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldestName = "";
        int oldestAge = -1;

        while (true) {
            String input = scanner.nextLine();

            // Exit the loop if input is empty
            if (input.isEmpty()) {
                break;
            }

            // Split the input into name and age, assuming comma separation
            String[] parts = input.split(",");

            // Ensure the input contains both a name and an age
            if (parts.length == 2) {
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);

                // Check if this person is older than the current oldest
                if (age > oldestAge) {
                    oldestAge = age;
                    oldestName = name;
                }
            }
        }


        if (oldestAge != -1) {
            System.out.println(oldestAge);
        }
    }
}



