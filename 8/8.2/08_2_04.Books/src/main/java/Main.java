import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> book = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Title: ");
            String title = scan.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.parseInt(scan.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.parseInt(scan.nextLine());

            book.add(new Book(title, pages, year));
        }
        System.out.print("What information will be printed? ");
        String input = scan.nextLine();
        for (int i = 0; i < book.size(); i++) {
            Book currentBook = book.get(i);
            if (input.equals("everything")) {
                System.out.println(currentBook);
            } else if (input.equals("name")) {
                System.out.println(currentBook.Title());
            }
        }

    }
}
