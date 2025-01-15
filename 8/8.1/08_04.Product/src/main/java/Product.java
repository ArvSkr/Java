public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        name = initialName;
        price = initialPrice;
        quantity = initialQuantity;
    }

    public void printProduct() {
        System.out.print(name + ", " + "price " + price + ", " + quantity + " pcs");
    }
}
