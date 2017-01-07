//contact class

public class Contact
{

	public static void main(String [] args)
	{
		System.out.println("Compiles");
	}
	
	private String email;
	
	private String phoneNumber;
	
	private String name;
	
	public Contact(String aName, String aEmail, String aPhoneNumber)
	{		
		name = aName;
		
		email = aEmail;
		
		phoneNumber = aPhoneNumber;
	}
	
	public Contact(String aName, String aPhoneNumber)
	{
		name = aName;
		
		email = "";
		
		phoneNumber = aPhoneNumber;
	}
	
	public void printContact()
	{
		System.out.println("Contact Info:");
		
		System.out.println("Name: " + name);
		
		System.out.println("Phone Number: " + phoneNumber);
		
		if (!email.equals(""))
		{
			System.out.println("Email: " + email);
		}
		
	}
	
	public String getName()
	{
		return name;
	}

}