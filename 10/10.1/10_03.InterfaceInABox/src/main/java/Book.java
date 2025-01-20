public class Book implements Packable {

    private String author;
    private String bookname;
    private double weight;

    public Book(String author, String bookname, double weight) {
        this.author = author;
        this.bookname = bookname;
        this.weight = weight;
    }


    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return author + ": " + bookname;
    }
}
