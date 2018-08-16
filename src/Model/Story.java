package Model;



/**
 * 
 */
public class Story extends Toy {

	   @Override
	   public float price() {
	      return 0.0f;
	   }

	   @Override
	   public String name() {
	      return "Story";
	   }
	   @Override
	   public String orderId() {
	      return "T1";
	   }
	}