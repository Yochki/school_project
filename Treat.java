package project;

import java.util.ArrayList;
import java.util.Arrays;

public class Treat {

	public static void main(String[] args) {

		PastryShop pastryShop = new PastryShop();
		pastryShop.name = "Candyshop";

		Cook radi = new Cook();
		radi.name = "Radi Chipanova";
		Cook raya = new Cook();
		raya.name = "Raya Stoqdinova";
		Cook yoana = new Cook();
		yoana.name = "Yoana Antonova";

		Cake cake1   = new Cake();
		cake1.cook = radi;
		cake1.Name = "Chocolate Fudge Cake ";
		Cake cake2   = new Cake();
		cake2.cook = radi;
		cake2.Name = "Red Velvet Cake";
		Cake cake3   = new Cake();
		cake3.cook = raya;
		cake3.Name = "Garash";
		Cake cake4   = new Cake();
		cake4.cook = raya;
		cake4.Name = "Sacher cake ";
		Cake cake5   = new Cake();
		cake5.cook = yoana;
		cake5.Name = "Carrot cake ";
		Cake cake6   = new Cake();
		cake6.cook = yoana;
		cake6.Name = "Rafaello ";
		
		radi.cakes = new ArrayList<Cake>(Arrays.asList(cake1, cake2));
		raya.cakes = new ArrayList<Cake>(Arrays.asList(cake3, cake4));
		yoana.cakes = new ArrayList<Cake>(Arrays.asList(cake5, cake6));
		
		pastryShop.cakes = new ArrayList<Cake>(Arrays.asList(cake1, cake2, cake3, cake4, cake5, cake6));

		System.out.println("Pastry shop: "+pastryShop.name);
		for (Cake cake : pastryShop.cakes) {
		    System.out.println(cake.Name +" made by "+cake.cook.name);
		}
	}

}
