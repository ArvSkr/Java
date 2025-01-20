import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> movable;


    public Herd() {

        this.movable = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.movable.add(movable);

    }


    @Override
    public void move(int dx, int dy) {
        for (Movable organism : movable) {
            organism.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String value = "";

        for (Movable organism : movable) {
            value += organism.toString();
            value += "\n";
        }
        return value;
    }
}
