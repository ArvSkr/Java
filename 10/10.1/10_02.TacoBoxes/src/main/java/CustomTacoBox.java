public class CustomTacoBox implements TacoBox {
    private int taco;

    public CustomTacoBox(int tacos) {
        taco = tacos;
    }

    @Override
    public int tacosRemaining() {
        return this.taco;
    }

    @Override
    public void eat() {
        if (taco > 0) {
            taco--;
        }
    }
}
