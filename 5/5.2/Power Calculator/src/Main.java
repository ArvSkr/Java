public class Main {
    public static void main(String[] args) {
        System.out.println(calculatePower(2, 3));
    }

    public static int calculatePower(int base, int exponent) {

        if (exponent == 0) {
            return 1;
        }


        if (exponent > 0) {
            return base * calculatePower(base, exponent - 1);
        }


        return 1 / calculatePower(base, -exponent);
    }
}
