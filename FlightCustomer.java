package customersystem;

//importation of particular packages to have access to certain object creations
import java.util.Random;
import java.text.DecimalFormat;

public class FlightCustomer extends Customer //subclass FlightCustomer with inheritance of Customer class
{
	//private instance variables
	private int seatNumber;
	private double ticketPrice;
	
	//random and decimal format object creation
	Random generator = new Random();
	DecimalFormat fmt = new DecimalFormat("000");
	
	
	//constructor for flight customer with necessary parameters
	public FlightCustomer(String name, int age, double ticketPrice)
	{
		super(name, age);
		seatNumber = generator.nextInt(200)+1;
		this.ticketPrice = ticketPrice;
	}
	
	//override of inherited importanceLevel method
	public String importanceLevel()
	{
		if (ticketPrice <= 100) 
			{return "regular member";}
	
		else if (ticketPrice > 100 && ticketPrice <=300)
			{return "bronze member";}
		
		else if (ticketPrice > 300 && ticketPrice <=600)
			{return "silver member";}
		else
			{return "gold member";}
	}
	
	//mutator methods 
	public void setSeatNumber(int seatNumber)
	{this.seatNumber = seatNumber ;}
	
	public void setTicketPrice(double ticketPrice)
	{this.ticketPrice = ticketPrice;}
	
	//accessor methods
	public int getSeatNumber()
	{return seatNumber;}
	
	public double getTicketPrice()
	{return ticketPrice;}
	
	//tostring method
	public String toString()
	{
		return  "\tName: " + getName() +
				"\n\tAge: " + getAge() +
				"\n\tTicket Price: " + ticketPrice +
				"\n\tSeat Number: " + fmt.format(seatNumber); //extra credit formatting seat number
	}
	
	
}
