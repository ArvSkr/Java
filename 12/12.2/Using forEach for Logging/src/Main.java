import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Supplier<String> nameSupplier = () -> {
            final String[] result = {""};
            names.forEach(name -> result[0] += name + "\n");
            return result[0];
        };
        System.out.println(nameSupplier.get());
    }
}