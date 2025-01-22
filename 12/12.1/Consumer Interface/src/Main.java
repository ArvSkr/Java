import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> printMessage = x -> System.out.println(x + " is awesome");
        printMessage.accept("Java");
    }
}