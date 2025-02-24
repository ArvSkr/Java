import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AverageOfNumbers {

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


        double average = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("Average of positive numbers: " + average);
    }


}