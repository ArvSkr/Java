
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldestName = "";
        int oldestAge = -1;

        while (true) {
            String input = scanner.nextLine();


            if (input.isEmpty()) {
                break;
            }


            String[] parts = input.split(",");


            if (parts.length == 2) {
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);

               
                if (age > oldestAge) {
                    oldestAge = age;
                    oldestName = name;
                }
            }
        }


        if (oldestAge != -1) {
            System.out.println("Age of the oldest: " + oldestAge);
        }
    }
}



