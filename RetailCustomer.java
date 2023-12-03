package customersystem;

import java.text.DecimalFormat;//importation of necessary package for object creation

public class RetailCustomer extends Customer  //subclass RetailCustomer with inheritance of Customer class
{
	//private instance variables
	private int itemsPurchased;
	private double totalSpent;
	
	DecimalFormat fmt = new DecimalFormat("0.00"); //Decimal Format object creation
	
	//retailcustomer constructor
	public RetailCustomer(String name, int age, int itemsPurchased, double totalSpent)
	{
		super(name, age);
		this.itemsPurchased = itemsPurchased;
		this.totalSpent = totalSpent;
	}
	
	//override of inherited importanceLevel method
	public String importanceLevel()
	{
		if (totalSpent <= 50) 
			{return "regular member";}
	
		else if (totalSpent > 50 && totalSpent <=100)
			{return "bronze member";}
		
		else if (totalSpent > 100 && totalSpent <=200)
			{return "silver member";}
		else
			{return "gold member";}
	}
	
	//mutator methods
	public void setItemsPurchased(int itemsPurchased)
	{this.itemsPurchased = itemsPurchased;}
	
	public void setTotalSpent(double totalSpent)
	{this.totalSpent = totalSpent;}
	
	//accesor methods
	public int getItemsPurchased()
	{return itemsPurchased;}
	
	public double getTotalSpent()
	{return totalSpent;}
	
	//toString method
	public String toString()
	{
		return  "\tName: " + getName() +
			  	"\n\tAge: " + getAge() +
				"\tItems Purchased: " + itemsPurchased +
				"\n\tTotal Spent: " + fmt.format(totalSpent); //format used here also
	}
	
}
