import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> items = Arrays.asList("apple", "banana", "orange", "apple", "grape", "apple", "banana");


        String targetItem = "apple";


        final int[] count = {0};


        items.forEach(item -> {
            if (item.equals(targetItem)) {
                count[0]++;
            }
        });


        System.out.println("The word " + targetItem + " appears " + count[0] + " times");
    }

}