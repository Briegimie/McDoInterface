package Model;





public class ChickenBurger extends Burger {

	   @Override
	   public float price() {
	      return 3.4f;
	   }

	   @Override
	   public String name() {
	      return "Chicken Burger";
	   }
	   @Override
	   public String orderId() {
	      return "B2";
	   }
	}