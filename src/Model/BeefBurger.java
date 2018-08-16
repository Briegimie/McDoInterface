package Model;



/**
 * 
 */

public class BeefBurger extends Burger {

	   @Override
	   public float price() {
	      return 5.6f;
	   }

	   @Override
	   public String name() {
	      return "Beef Burger";
	   }
	   
	   @Override
	   public String orderId() {
	      return "B1";
	   }
	}