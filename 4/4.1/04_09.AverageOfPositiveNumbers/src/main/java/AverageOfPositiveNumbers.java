
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;



        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                break;
            } else if (number > 0) {
                sum += number;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double avg = (double) sum / count;
            System.out.println(avg);
        }

    }

}
