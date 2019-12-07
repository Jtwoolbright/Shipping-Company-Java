//
//	Coded By: 	Josh Woolbright
//	Date:		12/10/2018
//
//	Description:
//				This is the Cargo Ship class. It is an extension of the
//				Ship class that adds an extra parameter to the constructor.
//
public class CargoShip extends Ship
{
	private int tonnage;

	public CargoShip(String shipName, String yearBuilt, int tonnage)
	{
		super(shipName, yearBuilt);
		this.tonnage = tonnage;
	}

	public int getTonnage()
	{
		return tonnage;
	}

	@Override
	public String toString()
	{
		return String.format("%-20s    Cargo:%d", super.toString(), tonnage);
	}
}
