
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    public void advance(){
        if (day < 30 && day != 30){
            day++;
        }
        if(day == 30 && month < 12 ){
            day -= 30;
            month++;
        } else if(month == 12 && day == 30){
            month -= 11;
            year++;
        }


    }
    public void advance(int howManyDays){

        if (day < 30){
            day += howManyDays;
        }
        if(day > 30 && month < 12 ){
            day -= 29;
            month++;
        }
        if(month == 12 && day == 30){
            month -= 11;
            year++;
            day -= (30 - howManyDays);
        }

    }
    public SimpleDate afterNumberOfdays(int days)
    {   SimpleDate newDate = new SimpleDate(day, month, year);
        if (day < 30) {
            day += days;
        }
        if (day > 30 && month < 12) {
            day -= 29;
            month++;
        }
        if (month == 12 && day == 30) {
            month -= 11;
            year++;
            day -= (30 - days);
        }


        return newDate;
    }
}
