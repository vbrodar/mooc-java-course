
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        int ownSquares = this.squares;
        int comparedSquares = compared.squares;
        if (ownSquares > comparedSquares) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        int ownPrice = this.squares * this.pricePerSquare;
        int comparedPrice = compared.squares * compared.pricePerSquare;

        int difference = Math.abs(ownPrice - comparedPrice);
        return difference;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int ownPrice = this.squares * this.pricePerSquare;
        int comparedPrice = compared.squares * compared.pricePerSquare;
        if (ownPrice > comparedPrice) {
            return true;
        } else {
            return false;
        }
    }
}
