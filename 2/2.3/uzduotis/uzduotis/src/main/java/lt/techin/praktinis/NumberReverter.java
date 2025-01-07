package lt.techin.praktinis;

public class NumberReverter {
    public void revert(int number) {
        int hundred = number / 100;
        int ten = (number / 10) % 10;
        int unit = number % 10;
        int reversedNumber = unit * 100 + ten * 10 + hundred;
        System.out.println(reversedNumber);
    }
}
