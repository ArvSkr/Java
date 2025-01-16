public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        if (day < 1 || day > 30 || month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid date");
        }
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

    public void advance() {
        this.advance(1);
    }

    public void advance(int howManyDays) {
        if (howManyDays < 0) {
            throw new IllegalArgumentException("Number of days to advance must be non-negative");
        }

        this.day += howManyDays;

        while (this.day > 30) {
            this.day -= 30;
            this.month++;

            if (this.month > 12) {
                this.month = 1;
                this.year++;
            }
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        if (days < 0) {
            throw new IllegalArgumentException("Number of days must be non-negative");
        }

        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }
}
