/**
   A class that creates an object capable of having a name and price.
   @author Danny Cannon
*/
public class Item {

	//Instance variables
	private double price;
	private String name;
	
	//Constructors
	/** Creates an item without parameters. */
	public Item() {
		name = "";
		price = 0;
	}//end empty-argument constructor
	
	/** Creates an item with parameters.
	 *  @param name  The desired item's name.
	 *  @param price  The desired item's price. */
	public Item(String name, double price) {
		setName(name);
		setPrice(price);
	}//end preferred constructor

	//Getters and Setters
	/** Queries for the name of an item.
	 *  @param anItem  Item to obtain the name of.
	 *  @return  The name of the specific item. */
	public String getName() {
		return name;
	}//end getName

	/** Allows the user to set or change the name of an item. */
	public void setName(String name) {
		this.name = name;
	}//end setName
	
	/** Checks the cost of a specific item.
	 *  @return the double cost of the item. */
	public double getPrice() {
		return price;
	}//end getPrice

	/** Allows the user to change the cost of an item. */
	public void setPrice(double price) {
		this.price = price;
	}//end setPrice

	/** toString override to simplify appearance & 
	 *  allow user to print name and price. */
	@Override
	public String toString() {
		return "- " + name + ": $" + price;
	}//end toString
	
}//end class
