package cafeBusiness;

import java.util.ArrayList;

public class TestCafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CafeUtil cafe1 = new CafeUtil();
		/*
		System.out.println("\n ---- Streak GoalTest -----------");
		
		System.out.printf("Purchases needed by Week 10: %s \n\n", cafe1.getStreakGoal1(10));
		
		
		System.out.println("\n ------ Order Total Test ------");
		double[] lineItems = {3.5, 1.5, 4.0, 4.5};
		System.out.printf("\n Order total: %s \n\n", cafe1.getOrderTotal(lineItems));
		
		
		System.out.println("\n ------- Display Menu Items -------");
		
		ArrayList<String> menu =  new ArrayList<String>();
		
		menu.add("drip coffee");
		menu.add("cappuccino");
		menu.add("latte");
		menu.add("mocha");
		
		cafe1.displayMenu(menu);
		
		
		System.out.println("\n ----- Add Customer Test----");
		
		ArrayList<String> customers = new ArrayList<String>();
		
		for(int i=0; i<4; i++)
		{
			cafe1.addCustomer(customers);
			System.out.println("\n");
		}
		*/
		//System.out.println("\n ------ printPriceChart ------");

		//cafe1.printPriceChart("Columbian Coffee Grounds", 2.00, 4);
		
		//cafe1.printPriceChart("Columbian Coffee Grounds", 15.0, 3);
		

		System.out.println("\n ----- displayMenu -------");
		
		ArrayList<String> menuItems = new ArrayList<String>();
		ArrayList<Double> prices = new ArrayList<Double>();
		
		menuItems.add("drip coffee");
		menuItems.add("cappucino");
		menuItems.add("latte");
		menuItems.add("mocha");
		
		prices.add(1.50);
		prices.add(3.50);
		prices.add(4.50);
		prices.add(3.50);
		
		
		
		cafe1.displayMenu(menuItems,prices);
		
		
		System.out.println("\n ----- Add Customer -------");
		
		cafe1.addCustomer();
		
	}
	
	
}
