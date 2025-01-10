public class Main {
    public static void main(String[] args) {
        System.out.println(digitSum(123));
    }

    public static int digitSum(int number) {
        int sum = 0;


        number = Math.abs(number);


        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}