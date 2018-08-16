package Controler;



import Model.BeefBurger;
import Model.ChickenBurger;
import Model.Coke;
import Model.Pepsi;
import Model.Story;
import Model.Technical;
import Model.VegBurger;
import Model.Violent;
import Model.Water;

public class MealBuilder {

	   public Meal prepareVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new VegBurger());
	      meal.addItem(new Coke());
	      meal.addItem(new Technical());
	      return meal;
	   }   

	   public Meal prepareNonVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new ChickenBurger());
	      meal.addItem(new Pepsi());
	      meal.addItem(new Violent());
	      return meal;
	   }
	   
	   public Meal prepareSuperSizeMeal (){
		      Meal meal = new Meal();
		      meal.addItem(new BeefBurger());
		      meal.addItem(new VegBurger());
		      meal.addItem(new Water());
		      meal.addItem(new Pepsi());
		      meal.addItem(new Story());
		      return meal;
		   }
	}