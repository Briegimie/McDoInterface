package Controler;

import java.util.ArrayList;

import Model.Item;
import Model.StandardMenu;

public class fn {

	//pour vérifier que l'utilisateur a saisi un code produit valide
	public static boolean validOrderId(String answer, Meal carte) {
		boolean result = false;
		for (Item item : carte.items) {
			if (answer.equalsIgnoreCase(item.orderId())) {
				result = true;
				break;
			}
		}

		return result;
	}

	//pour vérifier que l'utilisateur a saisi un code produit valide
	public static boolean validMenuId(String answer, ArrayList<StandardMenu> theMenus) {
		boolean result = false;
		for (StandardMenu standardMenu : theMenus) {
			if (answer.equalsIgnoreCase(standardMenu.orderId())) {
				result = true;
				break;
			}
		}

		return result;
	}

	//pour ajouter le produit commandé à la liste
	public static void orderIdToItem(String answer, Meal carte, Meal commande) {

		for (Item item : carte.items) {
			if (answer.equalsIgnoreCase(item.orderId())) {
				commande.addItem(item);
				break;
			}
		}

	}

	//pour ajouter le produit commandé à la liste
	public static void orderIdToMenu(String answer, ArrayList<StandardMenu> theMenus,
			ArrayList<StandardMenu> orderedMenus) {

		for (StandardMenu standardMenu : theMenus) {
			if (answer.equalsIgnoreCase(standardMenu.orderId())) {
				orderedMenus.add(standardMenu);
				break;
			}
		}

	}
	
	//pour afficher les menus commandables
		public static void showMenusToOrder(ArrayList<StandardMenu> theMenus) {

			for (StandardMenu standardMenu : theMenus) {
				System.out.print("Code : " + standardMenu.orderId());
				System.out.print(", Produit : " + standardMenu.name());
				System.out.println(", Prix : " + standardMenu.price() + " €");
			}
		}

	//pour afficher les menus commandés
	public static void showMenus(ArrayList<StandardMenu> orderedMenus) {

		for (StandardMenu standardMenu : orderedMenus) {
			System.out.print("Produit : " + standardMenu.name());
			System.out.println(", Prix : " + standardMenu.price() + " €");
			System.out.println("Ce menu contient :");
			for (Item item : standardMenu.meal().items) {
				System.out.print("Produit : " + item.name());
				System.out.println(", Emballage : " + item.packing().pack());
			}
			
			System.out.println("------");
		}
	}

	
	
	//pour calculer le coût des menus commandés
	public static float getCostMenus(ArrayList<StandardMenu> orderedMenus) {
		float total=0.0f;
		for (StandardMenu standardMenu : orderedMenus) {
			total += standardMenu.price();
		}
		return total;
	}

}
