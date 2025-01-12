public class Main {

    public static void main(String[] args) {
        oddMultiplicationTable(5);
    }

    public static void oddMultiplicationTable(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i % 2 != 0 && j % 2 != 0) {
                    System.out.print((i * j) + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}