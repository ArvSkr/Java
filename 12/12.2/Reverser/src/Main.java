import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 3));


        numbers.sort((a, b) -> b - a);


        System.out.println(numbers);
    }
}