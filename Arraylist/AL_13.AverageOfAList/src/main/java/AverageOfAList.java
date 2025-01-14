
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        int sum = 0;
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            count++;
        }
        double avg = (double) sum / count;
        System.out.println("Average: " + avg);
    }
}
