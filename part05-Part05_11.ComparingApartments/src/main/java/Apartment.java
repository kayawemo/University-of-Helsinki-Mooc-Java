
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    //compare
    public boolean largerThan(Apartment compared){
        return this.squares > compared.squares;
    }
    
    //price difference
    public int priceDifference(Apartment compared){
        int priceA = this.squares * this.princePerSquare;
        int priceB = compared.squares * compared.princePerSquare;
        
        int diff = priceA - priceB;
        
        if (diff < 1){
            diff = diff * -1;
        }
        return diff;
    }
    
    //more expensive
    public boolean moreExpensiveThan(Apartment compared){
        int priceA = this.squares * this.princePerSquare;
        int priceB = compared.squares * compared.princePerSquare;
        
        return priceA > priceB;
    }

}
