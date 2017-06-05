
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int priceOfApartment;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.priceOfApartment = squareMeters * pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment){
        
        if (this.rooms > otherApartment.rooms){
            return true;
        }        
        return this.rooms <= otherApartment.rooms && this.squareMeters > otherApartment.squareMeters;
    }
    
     public int priceDifference(Apartment otherApartment){
         int priceDiff = this.priceOfApartment - otherApartment.priceOfApartment;
         return Math.abs(priceDiff);
     }
     
      public boolean moreExpensiveThan(Apartment otherApartment){
          if (this.priceOfApartment > otherApartment.priceOfApartment){
              return true;
          }
          return false;
      }
}
