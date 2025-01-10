public class Main {
    public static void main(String[] args) {
        System.out.println(convertTemp(25));
    }

    public static String convertTemp(double celsius) {
        char degreeSymbol = '\u00B0';
        double f = (celsius * 9 / 5) + 32;
        String result = celsius + "" + degreeSymbol + "C is equal to " + f + degreeSymbol + "F";
        return result;
    }
}