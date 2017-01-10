//main model for the program

import java.util.*;

public class Model
{
	/*public static void main(String [] args)
	{
		Model model = new Model();
		
		model.addCustomer();
	}
	*/
	private ArrayList<Customer> customers;
	
	public Model()
	{
		customers = new ArrayList<Customer>();
	}
	
	public void addCustomer()
	{
		System.out.println("Gathering Contact Info");
		
		System.out.print("Enter Customer Name: ");
		
		Scanner input = new Scanner(System.in);
		
		String customerName = input.nextLine();
		
		System.out.print("Enter Phone Number: ");
		
		String phoneNumber = input.nextLine();
		
		System.out.print("Enter Email Address: ");
		
		String email = input.nextLine();
		
		Contact aContact = new Contact(customerName, email, phoneNumber);
		
		System.out.println("Gathering Customer Address");
		
		System.out.print("Enter Street Number: ");
		
		String streetNum = input.nextLine();
		
		System.out.print("Enter street name: ");
		
		String street = input.nextLine();
		
		System.out.print("Enter town name: ");
		
		String town = input.nextLine();
		
		System.out.print("Enter State name: ");
		
		String state = input.nextLine();
		
		System.out.print("Enter zip code: ");
		
		String zip = input.nextLine();
		
		Address address = new Address(streetNum, street, town, state, zip);
		
		Customer aCustomer = new Customer(aContact, address);
		
		customers.add(aCustomer);
		
		System.out.println("Customer Successfully added to records!");
	}
	
	private Customer findCustomer()
	{
		System.out.println("Enter Name of Customer: ");
		
		Scanner input = new Scanner(System.in);
		
		String customerName = input.nextLine();
		
		for (int i = 0; i < customers.size(); i++)
		{
			Customer aCustomer = customers.get(i);
			
			String name = aCustomer.getName();
			
			if (name.equals(customerName))
			{
				return aCustomer;
			}
		}
		
		System.out.println("No such customer Exists");
		
		return null;
	}
	
	public void printCustomers()
	{
		System.out.println("All Customers On File:");
		
		for (int i =0; i < customers.size(); i++)
		{
			Customer aCustomer = customers.get(i);
			
			System.out.println(aCustomer.getName());
		}
	}
	
	public void getStatus()
	{
		Customer aCustomer = findCustomer();
		
		aCustomer.printStatus();
	}
	
	public void addJob()
	{
		Customer aCustomer = findCustomer();
		
		aCustomer.addJob();
	}
	
	public void addPayment()
	{
		Customer aCustomer = findCustomer();
		
		aCustomer.addPayment();
	}
	
	public void viewCustomerInfo()
	{
		Customer aCustomer = findCustomer();
		
		aCustomer.printInfo();
	}
	
	public void viewTotals()
	{
		Customer aCustomer = findCustomer();
		
		aCustomer.printTotals();
	}
	
	public void viewPayments()
	{
		Customer aCustomer = findCustomer();
		
		aCustomer.printPayments();
	}
	
	public void viewJobs()
	{
		Customer aCustomer = findCustomer();
		
		aCustomer.printJobs();
	}
	
	
	
	/*	
	Functions:
	
	get revenue
	
	add scheduled visit - scheduling interface
	
	view projections
	
	other data stuff
	
	add sorting
	
	update function
	
	add writing to files
	
	add excel?
	
	add SQLData
	
	add GUI
	
	add Desktop Shortcut
	
	*/
	
}