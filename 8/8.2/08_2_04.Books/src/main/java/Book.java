public class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String inputtedtitle, int pages, int years) {
        title = inputtedtitle;
        this.pages = pages;
        year = years;
    }

    public String Title() {
        return title;
    }

    public int Pages() {
        return pages;
    }

    public int Years() {
        return year;
    }

    @Override
    public String toString() {
        return title + ", " + pages + " pages, " + year;
    }
}
