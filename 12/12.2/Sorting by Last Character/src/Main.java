import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // List of names
        List<String> names = Arrays.asList("Eve", "Alice", "Bob", "Charlie");


        names.sort((name1, name2) -> {

            char lastChar1 = name1.charAt(name1.length() - 1);
            char lastChar2 = name2.charAt(name2.length() - 1);


            return Character.compare(lastChar1, lastChar2);
        });


        names.forEach(System.out::println);
    }
}