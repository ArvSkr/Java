
import java.util.ArrayList;
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            String input = scanner.nextLine();


            if (input.isEmpty()) {
                break;
            }


            String[] parts = input.split("\\s+");
            ArrayList<String> list = new ArrayList<>();
            for (String part : parts) {
                list.add(part);
            }

            
            for (String part : list) {
                System.out.println(part);
            }
        }





    }
}
