package contoller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import model.*;

public class Coffe
{
	public static void main(String[] args)
	{
//		Beverage b1 = new Espresso();
//		Beverage b2 = new DarkRoast();
//		Beverage b3 = new HouseBlend();
//		
//		System.out.println(b1.getDescription());
//		System.out.println(b1.cost());
//		System.out.println();
//		
//		b2 = new Mocha(
//			new Mocha(
//			new Whip(
//			b2
//			)));
//		
//		System.out.println(b2.getDescription());
//		System.out.println(b2.cost());
//		System.out.println();
//		
//		b3 = new Soy(
//				new Mocha(
//				new Whip(
//				b3
//				)));
//		
//		System.out.println(b3.getDescription());
//		System.out.println(b3.cost());
		
		int c;
		try
		{
			InputStream in = new LowerCaseInputStream(
							new FileInputStream("test"));
			
			while((c = in.read()) >= 0)
			{
				System.out.print((char)c);
			}
		}
		catch (IOException e){e.printStackTrace();}
	}
}
