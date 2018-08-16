package Model;





public class Violent extends Toy {

	   @Override
	   public float price() {
	      return 0.0f;
	   }

	   @Override
	   public String name() {
	      return "Violent";
	   }
	   @Override
	   public String orderId() {
	      return "T3";
	   }
	}