import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static void main(String[] args) throws Exception {
        // Example usage
        List<Book> books = readBooks("books.txt"); // Replace with the actual file path
        for (Book book : books) {
            System.out.println(book.getName() + ", " + book.getPublishingYear() +
                    ", " + book.getPagecount() + ", " + book.getAuthor());
        }
    }

    public static List<Book> readBooks(String file) throws Exception {
        return Files.lines(Paths.get(file))
                .map(line -> {
                    String[] parts = line.split(",");
                    String name = parts[0].trim();
                    int publishingYear = Integer.parseInt(parts[1].trim());
                    int pageCount = Integer.parseInt(parts[2].trim());
                    String author = parts[3].trim();
                    return new Book(name, publishingYear, pageCount, author);
                })
                .collect(Collectors.toList());
    }
}
