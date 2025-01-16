
public class Main {

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(29,12,2011);

        int week = 1;
        while(week <= 7){
            System.out.println("Friday after " + week + " week is " + date);
            date = date.afterNumberOfdays(7);
            week++;
        }

    }
}
