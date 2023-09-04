/**
 * An interface that describes the operations of a shopping cart of items
 * Uses an ArrayBag of Item objects.
 * @author Danny Cannon
 */
public class ShoppingCart {

	//Instance Variable
	private ResizableArrayBag<Item> bag;
	
	//Constructor
	public ShoppingCart(ResizableArrayBag<Item> bag) {
		this.bag = bag;
	}//end empty-argument constructor
	
	/** Gets the current number of items in the cart.
    @return  The integer number of items currently in the cart. */
	public int getNumberOfItems() {
		return bag.getCurrentSize();
	}//end getNumberOfItems

	/** Checks if the shopping cart is empty.
	 *  @return  True if the cart is empty or false if it is not. */
	public boolean isEmpty() {
		return bag.isEmpty();
	}//end isEmpty

	/** Adds a specified new item to the cart.
	 *  @param newItem  The item to be added.
	 *  @return  True if the addition was successful, false if not. */
	public boolean add(Item newItem) {
		return bag.add(newItem);
	}//end add

	/** Prints all item names in the shopping cart without prices. */
	public void printNames() {
		Object[] itemArray = bag.toArray();
		if (bag.isEmpty()) {
			System.out.println("The cart is empty.");
		}//end if empty
		else {
			for (Object i : itemArray) {
				Item thisItem = (Item) i;
				System.out.println("- " + thisItem.getName());
		    } // end for iterator
		}//end else
	}//end printNames
	
	/** Prints all item names in the shopping cart with prices. 
	 *  Checks if cart is empty & informs user if it is. */
	public void printAll() {
		Object[] itemArray = bag.toArray();
		if (bag.isEmpty()) {
			System.out.println("The cart is empty.");
		}//end if empty
		else {
			for (Object i : itemArray) {
				Item thisItem = (Item) i;
				System.out.println(thisItem.toString());
		    } // end for iterator
		}//end else
	}//end printAll 
	
	/** Removes a random item from the bag, unless the bag is empty.
	 *  @return  Removed item if the bag was empty, null if not. */
	public Item remove() {
		return bag.remove();
	}//end random remove

	/** Removes one of a specific item from the cart, if possible.
	 *  @param anItem  The specific item to be removed.
	 *  @return  True if the removal was successful, false if not. */
	public boolean remove(Item anItem) {
		// TODO Auto-generated method stub
		return bag.remove(anItem);
	}//end specific remove

	/** Counts how many of a specific item are in the cart.
	 *  @param anItem  The item to obtain the quantity of.
	 *  @return  The integer number of the specific item in the cart. */
	public int getQuantityOf(Item anItem) {
		return bag.getFrequencyOf(anItem);
	}//end getQuantityOf

	/** Tests if a certain item is in the card
	 *  @param anItem  The item to search for
	 *  @return  True if the specific item is in the cart, false if not. */
	public boolean contains(Item anItem) {
		return bag.contains(anItem);
	}//end contains
	
	/** Puts the items in the cart into an array.
	 *  @return  Array of all the items in the cart with their names and costs. */
	public Item[] itemArray() {
		return bag.toArray();
	}//end itemArray

	/** Calculates the total cost of all items currently in the cart.
	 *  @return The double cost of the items in the shopping cart.*/
	public double getTotalCost() {
		Object[] itemArray = bag.toArray();
		double totalCost = 0;
		for (Object i : itemArray) {
			Item thisItem = (Item) i;
			totalCost += thisItem.getPrice();
	    } // end for
		return totalCost;
	}//end getTotalCost
	
	/** Removes all items from the shopping cart. */
	public void emptyCart() {
		bag.clear();
	}//end empty
	
}//end ShoppingCart class
