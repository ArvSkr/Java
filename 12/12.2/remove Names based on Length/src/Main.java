import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Tom", "Lisa", "Eve", "Robert", "Kate"));
        Supplier<String> nameremover = () -> {
            String result = "";
            for (String name : names) {
                result += name + "\n";
            }

            names.removeIf(name -> name.length() <= 3);
            return result;
        };

        System.out.println(nameremover.get());

        System.out.println(names);
    }
}