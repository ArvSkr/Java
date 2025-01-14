
import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }

            numbers.add(number);
        }
        if (numbers.size() >= 1 && numbers.size() >= 2) {
            sum += numbers.get(2);
            sum += numbers.get(1);
        }
        System.out.println(sum);

    }
}
