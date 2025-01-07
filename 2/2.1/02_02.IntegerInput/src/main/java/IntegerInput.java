
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = parseInt(scanner.nextLine());
        System.out.println("You gave the number " + number);

    }
}
