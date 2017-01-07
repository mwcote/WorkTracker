//customer class
import java.util.*;

public class Customer
{
	public static void main(String [] args)
	{
		Customer me = new Customer(new Contact("Matt", "mwcote97@gmail.com", "781-690-1933"), new Address("104", "Pine Grove Street", "Needham", "Massachusetts", "02494"));
		
		me.addJob();
		
		me.addPayment();
		
		me.printPayments();
		
		me.addPayment();
		
		me.addJob();
		
		me.printInfo();
		
		me.printStatus();
		
		me.printJobs();
		
		me.printPayments();
		
		me.printTotals();
	}
	
	private ArrayList<Double> payments;
	
	private ArrayList<Date> paymentDates;
	
	private ArrayList<Job> work;
	
	private Address address;
	
	private Contact contactInfo;
	
	private double balance;
	
	public Customer(Contact aContact, Address address)
	{
		payments = new ArrayList<>();
		
		paymentDates = new ArrayList<>();
		
		work = new ArrayList<>();
		
		contactInfo = aContact;
			
		this.address = address;
		
		balance = 0;
	}
	
	public void addJob()
	{
		System.out.print("Enter name of job: ");
		
		Scanner input = new Scanner(System.in);
		
		String jobName = input.nextLine();
		
		System.out.print("Enter date of job (M/D/YYYY): ");
		
		String dateString = input.nextLine();
		
		String [] dateArgs = dateString.split("/");
		
		Date aDate = new Date((Integer.parseInt(dateArgs[2]) - 1900), Integer.parseInt(dateArgs[0]), Integer.parseInt(dateArgs[1]));

		System.out.print("Enter cost: ");
		
		double cost = input.nextDouble();
		
		System.out.print("Enter time spent (hrs): ");
		
		double hours = input.nextDouble();

		input.nextLine();
		
		System.out.print("Has customer paid? (Y/N): ");
		
		String paidString = input.nextLine();
		
		boolean hasPaid;
		
		if (paidString.equals("Y"))
		{
			hasPaid = true;
			
			System.out.print("Take Payment from balance? (Y/N) ");
			
			String payPlan = input.nextLine();
			
			if (payPlan.equals("Y"))
			{
				balance -= cost;
			}
		}
		else
		{
			hasPaid = false;
			
			balance -= cost;
		}
		
		Job aJob = new Job(jobName, aDate, cost, hours, hasPaid);
		
		work.add(aJob);
		
		System.out.println("Job Successfully Recorded");
	}
	
	public void addPayment()
	{
		System.out.print("Enter amount paid: ");
		
		Scanner input = new Scanner(System.in);
		
		double payment = input.nextDouble();
		
		input.nextLine();
		
		System.out.print("Enter date of payment (M/D/YYYY): ");
		
		String dateString = input.nextLine();
		
		String [] dateArgs = dateString.split("/");
		
		Date aDate = new Date((Integer.parseInt(dateArgs[2]) - 1900), Integer.parseInt(dateArgs[0]), Integer.parseInt(dateArgs[1]));
		
		payments.add(payment);
		
		paymentDates.add(aDate);
		
		balance += payment;
	}

	public void printJobs()
	{
		for (int i = 0; i < work.size(); i++)
		{
			Job aJob =work.get(i);
			
			aJob.printJob();
		}
	}
	
	public void printPayments()
	{
		for (int i = 0; i < payments.size(); i++)
		{
			double aPayment =payments.get(i);
			
			Date aDate = paymentDates.get(i);
			
			System.out.printf("Payment #%d: $%.2f \n", (i + 1), aPayment);
			
			//System.out.println("Payment #" + (i + 1) + ": $" + aPayment);
			
			System.out.printf("%1s %2$tB %2$te, %2$tY \n", "Payment Date:", aDate);
			
			System.out.println();
		}	
	}
	
	public void printInfo()
	{
		System.out.println("Name: " + contactInfo.getName());	

		address.printAddress();
		
		contactInfo.printContact();
	}
	
	public void printStatus()
	{
		System.out.println("Name: " + contactInfo.getName());
		
		System.out.printf("Current Balance: $%.2f \n", balance);
	}
	
	public void printTotals()
	{
		double totalTime = 0;
		
		double totalCost = 0;
		
		for (int i = 0; i < work.size(); i++)
		{
			Job aJob =work.get(i);
			
			totalTime += aJob.getTime();
			
			totalCost += aJob.getCost();
		}
		
		System.out.println("Total Time Spent: " + totalTime + " hrs");
		
		System.out.printf("Total Cost: $%.2f \n", totalCost);
	}
}