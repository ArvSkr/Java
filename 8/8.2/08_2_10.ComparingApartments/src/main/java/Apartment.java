
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    public int getRooms(int room){
        return rooms;
    }
    public int getSquares(int square){
        return squares;
    }
    public int getPricePerSquare(int price){
        return pricePerSquare;
    }


    public boolean largerThan(Apartment compared){
        if( this.squares > compared.getSquares(squares)){
            return true;
        }
        else {
            return false;
        }
    }
    public int priceDifference(Apartment compared){
        int difference = 0;
            if(compared.getPricePerSquare(pricePerSquare) > this.pricePerSquare | compared.getPricePerSquare(pricePerSquare) < this.pricePerSquare){
                 difference = (this.pricePerSquare * this.squares) - (compared.getPricePerSquare(compared.pricePerSquare) * compared.getSquares(compared.squares));
                return Math.abs(difference);
            }
            else {
                return difference;
            }


    }
    public boolean moreExpensiveThan(Apartment compared){
        if( this.pricePerSquare > compared.getPricePerSquare(pricePerSquare)){
            return true;
        }
        else {
            return false;
        }
    }
}
