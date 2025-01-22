import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<String> task = new ArrayList<>(Arrays.asList("Task1", "Task2", "Task3"));
        Supplier<String> taskupdater = () -> {
            String result = "";
            for (String tasks : task) {
                result += tasks + "\n";
            }

            task.replaceAll(t -> t + "_done");
            return result.toString();
        };

        System.out.println(taskupdater.get());

        System.out.println(task);
    }
}
