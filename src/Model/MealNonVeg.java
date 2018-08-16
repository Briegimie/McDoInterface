package Model;

import Controler.Meal;
import Controler.MealBuilder;

public class MealNonVeg implements StandardMenu {

	@Override
	public Meal meal() {
		// TODO Auto-generated method stub
		return new MealBuilder().prepareNonVegMeal();
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Non vegetarian meal";
	}

	@Override
	public String orderId() {
		// TODO Auto-generated method stub
		return "M1";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 3.99f;
	}

}
