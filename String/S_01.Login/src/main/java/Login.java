
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String usern = scanner.nextLine();
        System.out.print("Enter password: ");
        String pswd = scanner.nextLine();

        if (usern.equals("alex") && pswd.equals("sunshine") || usern.equals("emma") && pswd.equals("haskell")) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
