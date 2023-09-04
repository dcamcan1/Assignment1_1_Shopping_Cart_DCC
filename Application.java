/**
 * A driver to test all aspects of the ShoppingCart and Item classes.
 * @author Danny Cannon
 */
public class Application {

	public static void main(String[] args) {
        
        /** TESTING ITEM CLASS */
        System.out.println("**********************\nTESTING ITEM CLASS:");
        /** Testing empty-argument and preferred constructors by
         *  creating some Item objects.*/
        Item wood = new Item(); //empty-argument constructor
        Item calculator = new Item("Old Calculator", 56.34); //preferred
        Item pingPongBall = new Item("Ping Pong Ball", 15.20);
        Item marshmallows = new Item("Little Marshmallows", 5.40);
        Item candle = new Item("Pretty Candle", 10.01);
        Item picture = new Item("Ugly Picture", 23.23);
        
        /** Testing getName method. */
        System.out.print("Testing getName: ");
        System.out.println(calculator.getName());
        
        /** Testing setName method. */
        System.out.print("Testing setName: ");
        wood.setName("Firewood");
        System.out.println(wood.getName());
        
        /** Testing getPrice method. */
        System.out.print("Testing getPrice: $");
        System.out.println(pingPongBall.getPrice());
        
        /** Testing setPrice method. */
        System.out.print("Testing setPrice: $");
        wood.setPrice(3.08);
        System.out.println(wood.getPrice());
        
        /** Testing modified toString method. */
        System.out.print("Testing modified toString: ");
        System.out.println(wood.toString());
        
        
        /** TESTING SHOPPINGCART CLASS */
        System.out.println("\n**********************\nTESTING SHOPPINGCART CLASS:");
        
        /** Creating a ShoppingCart instance using an ArrayBag. 
         *  (checks ShoppingCart constructor) */
        ShoppingCart cart = new ShoppingCart(new ResizableArrayBag<Item>());
        
        /** Testing getNumberOfItems method. Cart is currently empty. */
        System.out.print("Testing getNumberOfItems (should be 0): ");
        System.out.println(cart.getNumberOfItems());
        
        /** Testing isEmpty method. Cart is currently empty. */
        System.out.print("Testing isEmpty (should be true): ");
        System.out.println(cart.isEmpty());
        
        /** Testing add method by adding at least five items. 
         *  Demonstrating using printNames method. */
        System.out.println("\nTesting add (and printNames simultaneously): ");
        cart.add(wood);
        cart.add(calculator);
        cart.add(marshmallows);
        cart.add(pingPongBall);
        cart.add(candle);
        cart.add(picture);
        cart.printNames();
        
        /** Testing the printAll method. */
        System.out.println("\nTesting printAll: ");
        cart.printAll();
        
        /** Testing the remove (random item) method. */
        System.out.println("\nTesting random remove (should be 1 less than previous): ");
        cart.remove();
        cart.printNames();
        
        /** Testing the remove (specific item) method. */
        System.out.println("\nTesting specific remove (wood should be missing): ");
        cart.remove(wood);
        cart.printNames();
        
        /** Testing the getQuantityOf method. */
        System.out.print("\nTesting getQuantityOf (should be 0 or 1 depending on random remove): ");
        System.out.println(cart.getQuantityOf(candle));
       
        /** Testing the contains method. */
        Item pineapple = new Item("Prickly Pineapple", 3.53);
        cart.add(pineapple);
        System.out.print("Testing contains (should be true): ");
        System.out.println(cart.contains(pineapple));
        
        /** Testing the getTotalCost method. 
         *  Also tests the itemArray method since getTotalCost contains the method. */
        System.out.print("Testing getTotalCost and itemArray: ");
        System.out.printf("$%.2f\n", cart.getTotalCost());
        
        /** Testing the emptyCart method. */
        System.out.print("Testing emptyCart (should say cart is empty): ");
        cart.emptyCart();
        cart.printNames();
    }//end main
}//end class