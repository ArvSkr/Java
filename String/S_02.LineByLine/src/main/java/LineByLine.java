
import java.util.ArrayList;
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] myArray = text.split(" ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
            if (scanner.hasNextLine() && scanner.nextLine().isEmpty()) {
                break;
            }

        }


    }
}
