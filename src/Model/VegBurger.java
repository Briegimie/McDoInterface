package Model;



/**
 * 
 */


public class VegBurger extends Burger {

	   @Override
	   public float price() {
	      return 4.2f;
	   }

	   @Override
	   public String name() {
	      return "Veg Burger";
	   }
	   @Override
	   public String orderId() {
	      return "B3";
	   }
	}