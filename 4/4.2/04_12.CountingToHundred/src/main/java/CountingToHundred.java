
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine()); // skaicius kuri useris iterps
        for (int i = a; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
