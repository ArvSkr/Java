public class Main {
    public static void main(String[] args) {
        for (int h = 0; h < 24; h++) {
            for (int min = 0; min < 60; min++) {
                String formattedHour;
                String formattedMinute;


                if (h < 10) {
                    formattedHour = "0" + h;
                } else {
                    formattedHour = Integer.toString(h);
                }

                
                if (min < 10) {
                    formattedMinute = "0" + min;
                } else {
                    formattedMinute = Integer.toString(min);
                }

                // Print the formatted time
                System.out.println(formattedHour + ":" + formattedMinute);
            }
        }
    }
}