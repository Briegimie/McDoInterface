package Model;

import Controler.Meal;
import Controler.MealBuilder;

public class MealSuperSize implements StandardMenu {

	@Override
	public Meal meal() {
		// TODO Auto-generated method stub
		return new MealBuilder().prepareSuperSizeMeal();
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Supersize meal";
	}

	@Override
	public String orderId() {
		// TODO Auto-generated method stub
		return "M2";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 9.99f;
	}

}
