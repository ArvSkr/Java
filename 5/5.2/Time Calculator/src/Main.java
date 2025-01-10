public class Main {
    public static void main(String[] args) {
        System.out.println(minutesToTime(185));
    }

    public static String minutesToTime(int minutes) {
        int h = minutes / 60;
        int remainingmin = minutes % 60;
        String time = h + " hours and " + remainingmin + " minutes";
        return time;
    }
}