//Morgan Bragg
// 9/21/26
//RetailItem code from uml
//This is my workS

// implement retail item
public class RetailItem {
    //int private strings for retail item
    private String itemDescription;
    private int unitsOnHand;
    private double retailPrice;
    
    public RetailItem(String Description, Int UnitsOnHand, Double RetailPrice){
        if (units < 0) {
            throw new IllegalArgumentException("Units can't be negative.");
        }
        if (price < 0.0) {
            throw new IllegalArgumentException("Retail price can't be negative.");
        }
        description = desc;
        unitsOnHand = units;
        retailPrice = price;
    }

    /**
     * sets The number of units on hand. 
     */
    public void setUnitsOnHand(int units) {
        if (units < 0) {
            throw new IllegalArgumentException("Units on hand cannot be negative.");
        }
        unitsOnHand = units;
    }

    /*sets contrictions for retail price */
    public void setRetailPrice(double price) {
        if (price < 0.0) {
            throw new IllegalArgumentException("Retail price cannot be negative.");
        }
        retailPrice = price;
    }

    /**
     * Accessor for description.
     * @return The item's description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Accessor for unitsOnHand.
     * returns The number of units on hand.
     */
    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    /**
     * Accessor for retailPrice.
     * returns The retail price of the item.
     */
    public double getRetailPrice() {
        return retailPrice;
    }

    /**
     * Returns a string representation of the object.
     * returns A string holding the item details.
     */
   
    public String toString() {
        return description + "\n | " + unitsOnHand + "\n | " + retailPrice + "\n";
    }
}
    

