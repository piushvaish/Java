/** A simulated cash register that tracks the item counts and total amount due
 *
 */
public class CashRegister {
// instance variables declared
    private int itemCount;
    private double totalPrice;
    /**
     * construct a cash register with cleared item count and total
     */
    public CashRegister(){
        itemCount =0;
        totalPrice = 0;
    }
    /**
     * Adds an item to this cash register
     * @param price the price of this item
     */
    public void addItem(double price){
        //instance variables are accessed from above
        itemCount++;
    totalPrice = totalPrice + price;
    }
    /**
     * Gets the price of all items in the current sale
     * @return the total price
     */
    public double getTotal(){
        return totalPrice;
    }
    /**
     * Gets the number of items in the current sale
     * @return the item count
     */
    public int getCount(){
       return itemCount;

    }
    /**
     * Clear the item count and the total
     */
    public void clear(){
        // to get to original values
        itemCount = 0;
        totalPrice = 0;

    }

}



