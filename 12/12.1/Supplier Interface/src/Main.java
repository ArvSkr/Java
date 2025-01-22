import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        String[] greetings = {"Hello", "Hi", "Good Morning", "Good Evening", "Welcome"};
        Supplier<String> randomGreeting = () -> {
            Random random = new Random();
            int index = random.nextInt(greetings.length);
            return greetings[index];
        };

        System.out.println(randomGreeting.get());


    }
}