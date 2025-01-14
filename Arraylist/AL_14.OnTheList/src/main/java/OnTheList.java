
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.print("Search for? ");
        String name = scanner.nextLine();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(name)) {
                System.out.println(name + " was found!");
                break;
            } else if (list.size() - 1 == i) {
                System.out.println(name + " was not found!");
            }

        }
    }
}