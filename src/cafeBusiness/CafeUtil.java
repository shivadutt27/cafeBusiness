package cafeBusiness;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeUtil {
	
	public static double priceFinal;
	public int getStreakGoal()
	{
		
		int totalWeeks = 0;
		int[] listOfWeeks = new int[10];
		
		int size = listOfWeeks.length;
		
		for(int i=0; i<=size-1; i++)
		{
			listOfWeeks[i] = i+1;
			totalWeeks = totalWeeks+listOfWeeks[i];
		}
		
		
		return totalWeeks;
	}
	
	public int getStreakGoal(int numWeeks)
	{
		int[] listOfWeeks = new int[numWeeks];
		
		int totalWeeks = 0;
		
		int size = listOfWeeks.length;
		
		for(int i=0; i<size; i++)
		{
			listOfWeeks[i] = i+1;
			totalWeeks = totalWeeks+listOfWeeks[i];
			
		}
		
		return totalWeeks;	
	}
	
	public int getStreakGoal1(int numWeeks)
	{
		int totalWeeks = 0;
		
		ArrayList<Integer> listOfWeeks = new ArrayList<Integer>();
		
		for(int i=1; i<=numWeeks; i++)
		{
			totalWeeks = totalWeeks+i;
		}
		
		return totalWeeks;
		
	}
	
	public double getOrderTotal(double[] prices)
	{
		double totalPrice = 0.0;
		
		for(int i=0; i<prices.length; i++)
		{
			totalPrice = totalPrice+prices[i];
		}
		
		return totalPrice;
	}
	
	public void displayMenu(ArrayList<String> menuItems)
	{
		for(int i=0; i<menuItems.size(); i++)
		{
			System.out.println(menuItems.get(i).toString());
		}
	}
	
	
	public void addCustomer(ArrayList<String> customers)
	{
		int numberOfCustomer = customers.size();
		Scanner sc  = new Scanner(System.in);
		System.out.println("\n --- Please Enter your Name: ");
		String userName = sc.nextLine();
		System.out.printf("\n Hello %s There are %s people in fron of you", userName,numberOfCustomer);
		customers.add(userName);
		for(int i=0; i<customers.size(); i++)
		{
			String customer = customers.get(i).toString();
			System.out.printf("\n %s",customer);
		}
		
	}
	
	public void printPriceChart(String product, double price, int maxQuantity)
	{
		double counter = 0.0;
		System.out.printf("%s \n", product);
		for(int i=1; i<=maxQuantity; i++)
		{
			/*
			System.out.printf("%d - $%s \n", i,price*i-counter);
			counter+=0.5;
			*/
			System.out.printf("%d - $%.02f \n", i,price*i);
		}
	}
	
	
	public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices)
	{
		boolean flag = true;
		if (menuItems.size() != prices.size())
		{
			flag = false;
			System.out.println("\n size mismatch");
		}
		else {
			for(int i=0; i< menuItems.size(); i++)
			{
				System.out.printf("%d %s -- $%.2f \n", i,menuItems.get(i),prices.get(i));
			}
			
		}
		return flag;
	}

	public void addCustomer()
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> customers = new ArrayList<String>();
		System.out.println("\n -- Please Enter your Option ---- \n 1.) Add Custome \n 2.) Exit");
		
		
		
		int userInput = sc.nextInt();
		
		boolean flag = true;
		
		while(flag)
		{
			switch(userInput)
			{
			case 1: System.out.println("Enter your name \n");
				String userName = sc.nextLine();
				customers.add(userName);
				for(int i=0; i<customers.size(); i++)
				{
					System.out.println(customers.get(i));
				}
				break;
			case 2: flag = false;
				break;
			}
		}
		
		
	}
	
}

