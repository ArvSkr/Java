
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int a = Integer.parseInt(scanner.nextLine()); // skaicius kuri useris iterps

        int fac = 1;
        for (int i = 1; i <= a; i++) {
            fac *= i;
        }
        System.out.println("Factorial: " + fac);
    }
}
