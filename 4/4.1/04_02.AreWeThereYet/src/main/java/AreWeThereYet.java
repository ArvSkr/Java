
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int random = 4;
        while (true) {
            System.out.println("Give a number");
            int num = Integer.parseInt(scanner.nextLine());

            if (num == random) {
                break;
            }
        }
    }
}
