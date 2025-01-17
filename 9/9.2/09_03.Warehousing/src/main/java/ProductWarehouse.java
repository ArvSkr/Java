public class ProductWarehouse extends Warehouse {
    private String productname;

    public ProductWarehouse(String name, double capacity) {
        super(capacity);
        productname = name;
    }

    public String getName() {
        return productname;
    }

    public void setName(String newName) {
        productname = newName;
    }

    @Override
    public String toString() {
        return productname + ": balance = " + getBalance() + ", space left " + howMuchSpaceLeft();
    }
}
