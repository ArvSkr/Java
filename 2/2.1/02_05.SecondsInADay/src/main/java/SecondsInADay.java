
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int day = Integer.parseInt(scanner.nextLine());
        int seconds = (day * 86_400);
        System.out.println(seconds);
    }
}
