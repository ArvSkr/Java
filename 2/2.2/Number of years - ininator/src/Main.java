import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of minutes:");
        int min = Integer.parseInt(scan.nextLine());
        int year = min / 525_948;
        int days = min / 1440;
        System.out.println(min + " minutes is approximately " + year + " years and " + days + " days");

    }
}