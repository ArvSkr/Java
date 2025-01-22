import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        Supplier<String> numberEvenRemover = () -> {
            String result = "";
            for (int number : numbers) {
                result += number + ", ";
            }

            numbers.removeIf(number -> number % 2 == 0);
            return result;
        };

        System.out.println(numberEvenRemover.get());

        System.out.println(numbers);
    }
}

