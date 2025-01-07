package lt.techin.praktinis;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int thousand = number / 1000;
        int hundred = (number / 100) % 10;
        int ten = (number / 10) % 10;
        int unit = number % 10;
        int sum = thousand + hundred + ten + unit;
        System.out.println(sum);
    }
}
