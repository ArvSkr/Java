
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine();

            
            if (text.isEmpty()) {
                break;
            }

            String[] space = text.split(" ");
            for (int i = 0; i < space.length; i++) {
                if (space[i].contains("av")) {
                    System.out.println(space[i]);
                }
            }
        }

    }
}
