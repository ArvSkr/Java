public class Main {
    public static void main(String[] args) {
        System.out.println(calculateDistance(0, 0, 3, 4));
    }

    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }
}