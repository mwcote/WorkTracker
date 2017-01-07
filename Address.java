//address class

public class Address
{	
	private String streetNum;
	
	private String streetName;
	
	private String townName;
	
	private String zipCode;
	
	private String stateName;
	
	public Address(String num, String street, String town, String state, String zip)
	{
		streetNum = num;
		
		streetName = street;
		
		townName = town;
		
		zipCode = zip;
		
		stateName = state;
	}
	
	public String getAddress()
	{
		
		String address = streetNum + " " + streetName + ", " + townName + " " + stateName + " " + zipCode;
		
		return address;
	}
	
	public void printAddress()
	{
		System.out.println("Address:");
		
		System.out.println(streetNum + " " + streetName);
		
		System.out.println(townName + " " + stateName + " " + zipCode);
	}
	
	public void changeAddress(String num, String street, String town, String zip, String state)
	{
		streetNum = num;
		
		streetName = street;
		
		townName = town;
		
		zipCode = zip;
		
		stateName = state;
	}
}