package Model;




public class Water extends Drink {

	   @Override
	   public float price() {
	      return 0.5f;
	   }

	   @Override
	   public String name() {
	      return "Water";
	   }
	   @Override
	   public String orderId() {
	      return "D3";
	   }
	}