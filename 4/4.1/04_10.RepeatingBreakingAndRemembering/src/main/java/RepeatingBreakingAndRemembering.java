
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int evenCount = 0;
        int oddCount = 0;
        System.out.println("Give numbers:");
        while (true) {
            int number = Integer.parseInt(scan.nextLine());

            if (number == -1) {
                break;
            }

            sum += number;
            count++;

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + ((count > 0) ? (1.0 * sum / count) : 0));
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);


    }
}
