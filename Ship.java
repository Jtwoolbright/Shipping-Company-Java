//
//	Coded By:	Josh Woolbright
//	Date:		12/10/2018
//
//	Description:
//				This is the ships class. It used to create
//				a ship object with the parameters listed.
//
public class Ship
{
	private String shipName;
	private String yearBuilt;

	public Ship(String shipName, String yearBuilt)
	{
		this.shipName = shipName;
		this.yearBuilt = yearBuilt;
	}

	public String getShipName()
	{
		return shipName;
	}

	public String getYearBuilt()
	{
		return yearBuilt;
	}

	@Override
	public String toString()
	{
		return shipName;
	}
}

