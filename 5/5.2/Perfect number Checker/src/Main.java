public class Main {
    public static boolean isPerfect(int number) {
        int sum = 0;


        for (int i = 1; i < number; i++) {
            if (isDivisor(number, i)) {
                sum += i;
            }
        }


        return sum == number;
    }

    public static boolean isDivisor(int number, int i) {
        return number % i == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPerfect(6));
        System.out.println(isPerfect(15));
    }
}