package Model;





public class Pepsi extends Drink {

	   @Override
	   public float price() {
	      return 1.2f;
	   }

	   @Override
	   public String name() {
	      return "Pepsi";
	   }
	   @Override
	   public String orderId() {
	      return "D2";
	   }
	}