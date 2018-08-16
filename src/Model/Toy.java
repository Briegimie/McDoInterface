package Model;



/**
 * 
 */
public abstract class Toy implements Item {

	   @Override
	   public Packing packing() {
	      return new Gift();
	   }

	   @Override
	   public abstract float price();
	   
	   public String orderId() {
	        // TODO implement here
	        return "";
	    }
	}