//
//	Coded By:	Josh Woolbright
//	Date:		12/10/2018
//
//	Description:
//				This program creates and prints an inventory of ships from a file.
//				The ships are categorized as either cargo or cruise.
//
import java.util.Scanner;
import java.io.*;

public class ShipDemo
{
	public static void main(String[] args)
	{
		String companyName;
		int totalShips;
		Ship[] shipInventory;
		int totalPassengers = 0;
		int totalTonnage = 0;

		File file = new File("myShips.txt");
		try
		{
			Scanner inputFile = new Scanner(file);
			companyName = niceName(inputFile.next());
			totalShips = inputFile.nextInt();
			shipInventory = new Ship[totalShips];

			System.out.println();
			System.out.println("Welcome to " + companyName + " by Josh Woolbright\n");
			System.out.println("Ship name               Type");
			System.out.println("---------------------   ---------------");
			for(int i = 0; i < totalShips; i++)
			{
				char shipType = inputFile.next().charAt(0);
				String shipName = niceName(inputFile.next());
				String yearBuilt = inputFile.next();

				switch(shipType)
				{
					case 'c':
						int passengers = inputFile.nextInt();
						totalPassengers += passengers;
						shipInventory[i] = new CruiseShip(shipName, yearBuilt,
  										  passengers);
						break;

					case 'C':
						int tonnage = inputFile.nextInt();
						totalTonnage += tonnage;
						shipInventory[i] = new CargoShip(shipName, yearBuilt,
										 tonnage);
						break;
				}

				System.out.println(shipInventory[i]);
			}
			System.out.println();
			System.out.println("Total Ships = " + totalShips);
			System.out.println("Total Passengers = " + totalPassengers);
			System.out.println("Total Tonnage = " + totalTonnage);
			inputFile.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error: File Not Found");
		}
	}

	public static String niceName(String name)
	{
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < name.length(); i++)
		{
			result.append(name.charAt(i) != '_'? name.charAt(i):' ');
		}

		return result.toString();
	}
}
