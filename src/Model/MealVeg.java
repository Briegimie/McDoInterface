package Model;

import Controler.Meal;
import Controler.MealBuilder;

public class MealVeg implements StandardMenu {

	@Override
	public Meal meal() {
		// TODO Auto-generated method stub
		return new MealBuilder().prepareVegMeal();
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Vegetarian meal";
	}

	@Override
	public String orderId() {
		// TODO Auto-generated method stub
		return "M3";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 4.99f;
	}

}
