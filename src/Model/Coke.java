package Model;



/**
 * 
 */


public class Coke extends Drink {

	   @Override
	   public float price() {
	      return 1.3f;
	   }

	   @Override
	   public String name() {
	      return "Coke";
	   }
	   @Override
	   public String orderId() {
	      return "D1";
	   }
	}