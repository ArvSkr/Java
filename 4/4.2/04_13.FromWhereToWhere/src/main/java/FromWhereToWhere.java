
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where to? ");
        int a = Integer.parseInt(scanner.nextLine()); // skaicius kuri useris iterps
        System.out.print("Where from ? ");
        int b = Integer.parseInt(scanner.nextLine());
        for (int i = b; i <= a; i++) {
            System.out.println(i);
        }
    }
}
