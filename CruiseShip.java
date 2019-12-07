//
//	Coded By:	Josh Woolbright
//	Date:		12/10/2018
//
//	Description:
//				This is the Cruise Ship class. It is an extension of the
//				Ship class that adds and extra parameter to the constructor.
//
public class CruiseShip extends Ship
{
	private int passengers;

	public CruiseShip(String shipName, String yearBuilt, int passengers)
	{
		super(shipName, yearBuilt);
		this.passengers = passengers;
	}

	public int getPassengers()
	{
		return passengers;
	}

	@Override
	public String toString()
	{
		return String.format("%-20s    Cruise:%d", super.toString(), passengers);
	}
}