package Controler;
import java.util.ArrayList;
import java.util.List;

import Model.Item;

public class Meal {
   public List<Item> items = new ArrayList<Item>();	

   public void addItem(Item item){
      items.add(item);
   }

   public float getCost(){
      float cost = 0.0f;
      
      for (Item item : items) {
         cost += item.price();
      }		
      return cost;
   }

   public void showItems(){
   
      for (Item item : items) {
         System.out.print("Produit : " + item.name());
         System.out.print(", Emballage : " + item.packing().pack());
         System.out.println(", Prix : " + item.price() +" €");
      }		
   }
   public void showItemsToOrder(){
	   
	      for (Item item : items) {
	    	 System.out.print("Code : " + item.orderId());
	    	 System.out.print(", Produit : " + item.name());
	         System.out.println(", Prix : " + item.price() +" €");
	      }		
	   }
}