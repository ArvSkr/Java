import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadingFilesPerLine {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file path:");
        String filePath = scanner.nextLine();

        List<String> lines = read(filePath);
        for (String line : lines) {
            System.out.println(line);
        }
    }

    public static List<String> read(String filePath) throws Exception {
        List<String> lines = new ArrayList<>();
        Stream<String> stream = Files.lines(Paths.get(filePath));
        lines = stream.collect(Collectors.toList());
        return lines;
    }
}
