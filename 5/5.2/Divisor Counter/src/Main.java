public class Main {
    // Method to count the divisors of a number
    public static int countDivisors(int number) {
        int count = 0;

        // Loop through all numbers from 1 to 'number'
        for (int i = 1; i <= number; i++) {
            if (isDivisor(number, i)) {
                count++;
            }
        }

        return count;
    }

    // Method to check if 'i' is a divisor of 'number'
    public static boolean isDivisor(int number, int i) {
        return number % i == 0;
    }


    public static void main(String[] args) {
        System.out.println(countDivisors(12));

    }
}