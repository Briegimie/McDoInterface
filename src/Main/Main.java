package Main;

import java.util.Scanner;

import Controler.Meal;
import Controler.fn;
import Model.BeefBurger;
import Model.ChickenBurger;
import Model.Coke;
import Model.MealNonVeg;
import Model.MealSuperSize;
import Model.MealVeg;
import Model.Pepsi;
import Model.StandardMenu;
import Model.VegBurger;
import Model.Water;
import java.util.*;

/**
 * 
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String QUIT = "x";
		int nbOrderedItems = 0; //pour adapter le message si le client ne commande rien
		float total = 0.0f; //pour faire la somme de la commande à la carte et des menus commandés
		String answer = ""; //pour enregistrer les réponses de l'utilisateur
		
		//ce qui est commandable à la carte
		Meal carte = new Meal();
		carte.addItem(new BeefBurger());
		carte.addItem(new ChickenBurger());
		carte.addItem(new VegBurger());
		carte.addItem(new Coke());
		carte.addItem(new Pepsi());
		carte.addItem(new Water());

		//ce qui est commandable en menu
		ArrayList<StandardMenu> theMenus = new ArrayList<StandardMenu>();
		theMenus.add(new MealNonVeg());
		theMenus.add(new MealSuperSize());
		theMenus.add(new MealVeg());
		
		//ce qui est commandé à la carte et en menu
		Meal commande = new Meal();
		ArrayList<StandardMenu> orderedMenus = new ArrayList<StandardMenu>();
		
		//début du dialogue utilisateur
		//commande des produits
		System.out.println("Bienvenue dans notre restaurant. Que désirez-vous commander ?");
		do {
			System.out.println("Voici notre carte :");
			carte.showItemsToOrder();
			fn.showMenusToOrder(theMenus);

			do {
				answer = "";
				System.out.println(String.format(
						"Saisissez un code pour ajouter un produit ou bien '%s' pour passer à la caisse", QUIT));
				answer = sc.nextLine();

				if (fn.validOrderId(answer, carte)) {
					fn.orderIdToItem(answer, carte, commande);
					nbOrderedItems++;
				} else if (fn.validMenuId(answer, theMenus)) {
					fn.orderIdToMenu(answer, theMenus, orderedMenus);
					nbOrderedItems++;
				}

			} while (!fn.validOrderId(answer, carte) && !fn.validMenuId(answer, theMenus)
					&& !answer.equalsIgnoreCase(QUIT));

			do {
				if (answer.equalsIgnoreCase(QUIT)) {
					break;
				}
				answer = "";
				System.out.println("Souhaitez-vous ajouter autre chose ? (o/n)");
				answer = sc.nextLine();
			} while (!answer.equalsIgnoreCase("o") && !answer.equalsIgnoreCase("n"));
			if (answer.equalsIgnoreCase(QUIT)) {
				break;
			}
		} while (answer.equalsIgnoreCase("o"));
		
		//passage en caisse
		if (nbOrderedItems == 0) {
			System.out.println("Vous n'avez rien commandé, bonne journée");
		} else {
			total = commande.getCost() + fn.getCostMenus(orderedMenus);
			
			System.out.println("Nous sommes en caisse");
			System.out.println(String.format("Vous avez commandé %d produits", nbOrderedItems));
			System.out.println("Contenu de votre commande :");
			System.out.println("######");
			System.out.println("À la carte :");
			commande.showItems();
			System.out.println("######");
			System.out.println("En menu : ");
			fn.showMenus(orderedMenus);
			System.out.println(String.format("Votre facture s'élève à %.2f €", total));
		}

		sc.close();

	};

}