
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 0) {
                sum++;
            }

            if (number == 0) {
                break;
            }
        }
        System.out.println("Number of negative numbers: " + sum);
    }
}
