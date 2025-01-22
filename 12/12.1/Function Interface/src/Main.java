import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, String> number = x -> x.toString();
        System.out.println(number.apply(5));
    }
}