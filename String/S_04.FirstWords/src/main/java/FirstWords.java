
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            String text = scanner.nextLine();


            if (text.isEmpty()) {
                break;
            }


            String[] parts = text.split("\\s+");


            if (parts.length > 0) {
                System.out.println(parts[0]);
            }
        }

    }
}
