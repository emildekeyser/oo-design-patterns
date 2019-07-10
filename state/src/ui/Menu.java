package ui;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import domain.model.PartyItem;

public class Menu 
{	
	public static final String[] menu = 
		{
				"ADD party item",
				"REMOVE party item",
				"RENT party item",
				"RETURN party item",
				"REPAIR party item",
				"LIST party items",
				"STOP"
		};
	
	public static void main(String[] args) throws IOException
	{
		HashMap<String, PartyItem> map = new HashMap<String, PartyItem>();
		
		for (int i = 0; i < menu.length; i++)
		{
			System.out.println(i + ". " + menu[i]);
		}
		Scanner sc = new Scanner(System.in);
		String input = "", input2 = "", input3 = "";
		while(!input.toUpperCase().equals("STOP")) 
		{   
			input = sc.nextLine();
			switch (input.toUpperCase())
			{
				case "ADD" :
					System.out.print("name: ");
					input2 = sc.nextLine();
					System.out.print("price: ");
					input3 = sc.nextLine();
					PartyItem np = new PartyItem(input2, Integer.parseInt(input3));
					map.put(input2, np);
					break;
				case "REMOVE": 
					System.out.print("name: ");
					input2 = sc.nextLine();
					map.get(input2).remove();
					break;
				case "RENT":
					System.out.print("name: ");
					input2 = sc.nextLine();
					map.get(input2).rent();
					break;
				case "RETURN": 
					System.out.print("name: ");
					input2 = sc.nextLine();
					System.out.print("damaged ? (Y/n): ");
					boolean damaged = sc.nextLine().toUpperCase().startsWith("Y");
					map.get(input2).returnItem(damaged);
					break;
				case "REPAIR":
					System.out.print("name: ");
					input2 = sc.nextLine();
					map.get(input2).repair();
					break;
				case "LIST":
					for (PartyItem p : map.values())
					{
						System.out.println("[" + p.getName() + "]=(" + p.getRentPrice() + "<" + p.getState() + ">");
					}
					break;
				default :
					break;
			}
		}
	}
}
