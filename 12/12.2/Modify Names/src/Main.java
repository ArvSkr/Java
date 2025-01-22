import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        Supplier<String> namereplacer = () -> {
            String result = "";
            for (String name : names) {
                result += name + "\n";
            }

            names.replaceAll(String::toUpperCase);
            return result;
        };

        System.out.println(namereplacer.get());

        System.out.println(names);
    }
}