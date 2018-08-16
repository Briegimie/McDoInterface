package Model;

import Controler.Meal;

public interface StandardMenu {
	
	//public Meal meal = new Meal();
    
    public Meal meal();
	public String name() ;
    public String orderId() ;
    public abstract float price();

}
