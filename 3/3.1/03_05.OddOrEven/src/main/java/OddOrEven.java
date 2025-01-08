
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();

        if (number % 2 == 0)
            System.out.println("Number " + number + " is even.");
        else
            System.out.println("Number " + number + " is odd.");

    }
}
