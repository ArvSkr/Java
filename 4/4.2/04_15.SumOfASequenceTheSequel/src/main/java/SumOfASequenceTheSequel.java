
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number? ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.print("Last number? ");
        int a = Integer.parseInt(scanner.nextLine()); // skaicius kuri useris iterps

        int sum = 0;
        for (int i = b; i <= a; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
