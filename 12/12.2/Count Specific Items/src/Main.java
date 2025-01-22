import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> items = Arrays.asList("apple", "banana", "orange", "apple", "grape", "apple", "banana");

        // Item to count
        String targetItem = "apple";

        // Using forEach with a lambda to count specific item (e.g., "apple")
        // Initialize the count variable
        final int[] count = {0}; // Array used to hold the count (because variables inside lambdas must be final or effectively final)

        // Lambda expression inside forEach to count the specific item
        items.forEach(item -> {
            if (item.equals(targetItem)) {
                count[0]++;  // Increment count when the item matches the targetItem
            }
        });

        // Output the result
        System.out.println("The word " + targetItem + " appears " + count[0] + " times");
    }

}