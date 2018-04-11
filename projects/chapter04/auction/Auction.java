import java.util.ArrayList;
import java.util.LinkedList;

/**
 * A simple model of an auction.
 * The auction maintains a list of lots of arbitrary length.
 *
 * @author David J. Barnes and Michael Kolling.
 * @version 2006.03.30
 */
public class Auction
{
    // The list of Lots in this auction.
    private ArrayList<Lot> lots;
    // The number that will be given to the next lot entered
    // into this auction.
    private int nextLotNumber;

    private LinkedList<Lot> lotLinked = new LinkedList<Lot>();
    
    /**
     * Create a new auction.
     */
    public Auction()
    {
        lots = new ArrayList<Lot>();
        nextLotNumber = 1;
    }

    /**
     * Enter a new lot into the auction.
     * @param description A description of the lot.
     */
    public void enterLot(String description)
    {
        lots.add(new Lot(nextLotNumber, description));
        nextLotNumber++;
    }

    /**
     * Show the full list of lots in this auction.
     */
    public void showLots()
    {
        for(Lot lot : lots) {
            System.out.println(lot.toString());
        }
    }
    
    /**
     * Bid for a lot.
     * A message indicating whether the bid is successful or not
     * is printed.
     * @param number The lot number being bid for.
     * @param bidder The person bidding for the lot.
     * @param value  The value of the bid.
     */
    public void bidFor(int lotNumber, Person bidder, long value)
    {
        Lot selectedLot = getLot(lotNumber);
        if(selectedLot != null) {
            boolean successful = selectedLot.bidFor(new Bid(bidder, value));
            if(successful) {
                System.out.println("The bid for lot number " +
                                   lotNumber + " was successful.");
            }
            else {
                // Report which bid is higher.
                Bid highestBid = selectedLot.getHighestBid();
                System.out.println("Lot number: " + lotNumber +
                                   " already has a bid of: " +
                                   highestBid.getValue());
            }
        }
    }

    /**
     * Return the lot with the given number. Return null
     * if a lot with this number does not exist.
     * @param lotNumber The number of the lot to return.
     */
    public Lot getLot(int lotNumber)
    {
        if((lotNumber >= 1) && (lotNumber <= lots.size())) {
            // The number seems to be reasonable.
            Lot selectedLot = lots.get(lotNumber - 1);
            return selectedLot;
        }
        else {
            System.out.println("Lot number: " + lotNumber +
                               " does not exist.");
            return null;
        }
    }
    
    public void close(){
        for(Lot lot:lots){
            if(lot.getHighestBid() != null){
                System.out.println("this lot:"+ lot.getDescription() +" is sold,the bidder is:"+lot.getHighestBid().getBidder());
            }else{
                System.out.println("this lot:"+ lot.getDescription() +" is unsold");
            }
        }
    }
    
    public ArrayList<Lot> getUnsold(){
        ArrayList<Lot> unsoldLots = new ArrayList<Lot>();
        for(Lot lot:lots){
            if(lot.getHighestBid() == null){
                unsoldLots.add(lot);
            }
        }
        return unsoldLots;
    }
    
    public Lot removeLot(int number){
        int index = number -1;
        Lot result;
        if( index >=0 && index < lots.size()){
            result = lots.remove(index);
        }else{
            System.out.println("该拍品不存在");
            return null;
        }
        
        for(int i = index+1; i<lots.size(); i++){
            
        } 
        return result;
    }
    
    public void test(){
        
        lotLinked.add(new Lot(1,"001"));
        lotLinked.add(new Lot(2,"002"));
        lotLinked.add(new Lot(3,"003"));
        lotLinked.add(new Lot(4,"004"));
    }
    
    public void removelinked(){
        lotLinked.remove(0);
    }
}
