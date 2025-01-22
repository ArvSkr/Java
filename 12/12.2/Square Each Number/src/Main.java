import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        Supplier<String> numbersquare = () -> {
            String result = "";


            for (int number : numbers) {
                result += number + "\n";
            }


            numbers.replaceAll(t -> (int) Math.pow(t, 2)); // This changes the list in place

            return result;
        };


        System.out.println(numbersquare.get());

        System.out.println(numbers);
    }

}