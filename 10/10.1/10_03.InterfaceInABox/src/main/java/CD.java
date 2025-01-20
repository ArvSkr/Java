public class CD implements Packable {
    private String author;
    private String cdname;
    private double weight = 0.1;
    private int year;

    public CD(String author, String cdname, int year) {
        this.author = author;
        this.cdname = cdname;
        this.year = year;
    }


    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return author + ": " + cdname + " (" + year + ")";
    }
}

