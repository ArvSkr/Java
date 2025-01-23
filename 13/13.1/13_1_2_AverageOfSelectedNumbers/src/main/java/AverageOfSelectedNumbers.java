import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            int number = Integer.parseInt(input);
            numbers.add(number);
        }

        System.out.println("Print the average of the negativ numbers or the positive numbers?" + "(n/p)");
        String option = scanner.nextLine();
        if (option.equals("n")) {
            double average = numbers.stream()
                    .mapToDouble(Integer::doubleValue)
                    .filter(num -> num < 0)
                    .average()
                    .orElse(0.0);

            System.out.println("Average of negative numbers: " + average);
        }
        if (option.equals("p")) {
            double average = numbers.stream()
                    .mapToDouble(Integer::doubleValue)
                    .filter(num -> num > 0)
                    .average()
                    .orElse(0.0);

            System.out.println("Average of positive numbers: " + average);
        }

    }


}
