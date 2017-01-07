//job class
import java.util.*;

public class Job
{
	/*
	public static void main(String [] args)
	{
		System.out.println("Compiles");
		
		Job ajob = new Job("Raking", new Date(117, 0, 7), 20, 1, true);
		
		ajob.printJob();
	}
	*/
	
	private String name;
	
	private Date date;
	
	private double cost;
	
	private boolean hasPaid;
	
	private double timeSpent;
	
	public Job(String aName, Date aDate, double aCost, double time, boolean paid)
	{
		name = aName;
		
		date = aDate;
		
		cost = aCost;
		
		timeSpent = time; 
		
		hasPaid = paid;
	}
	
	public double getCost()
	{
		return cost;
	}
	
	public double getTime()
	{
		return timeSpent;
	}
	
	public void printJob()
	{
		System.out.println("Job: " + name);
		
		System.out.printf("%1s %2$tB %2$te, %2$tY \n", "Date:", date);
		
		System.out.println("Cost: " + cost);
		
		System.out.println("Time Spent: " + timeSpent + " hrs");
		
		if (hasPaid)
		{
			System.out.println("Paid: YES");
		}
		else
		{
			System.out.println("Paid: NO");
		}
	}
}