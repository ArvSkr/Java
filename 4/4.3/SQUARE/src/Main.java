public class Main {
    public static void main(String[] args) {
        int sideLength = 8;
        char symbol = '#';


        for (int i = 0; i < sideLength; i++) {

            for (int j = 0; j < sideLength; j++) {

                if (i == 0 || i == sideLength - 1 || j == 0 || j == sideLength - 1) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}