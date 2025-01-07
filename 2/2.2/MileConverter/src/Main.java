import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter miles:");
        int mile = Integer.parseInt(scan.nextLine());
        double kilo = mile * 1.6;
        System.out.println(mile + " miles is " + kilo + " kilometers");

    }
}