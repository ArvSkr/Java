
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            printText();
        }
    }

    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
