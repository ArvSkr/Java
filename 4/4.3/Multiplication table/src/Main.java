public class Main {
    public static void main(String[] args) {
        int size = 9; // Size of the multiplication table


        System.out.print("    ");
        for (int i = 1; i <= size; i++) {
            System.out.print(i + "   ");
        }
        System.out.println();


        System.out.print("");
        for (int i = 1; i <= size; i++) {
            System.out.print("-----");
        }
        System.out.println();


        for (int i = 1; i <= size; i++) {

            System.out.print(i + " | ");


            for (int j = 1; j <= size; j++) {

                if (i * j >= 10) {
                    System.out.print((i * j) + "  ");
                } else System.out.print((i * j) + "   ");
            }

            System.out.println();
        }
    }

}