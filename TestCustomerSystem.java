/**Student Name: First Last
*Date Completed: 10/24/2022
*Project No. and Page No. in the book: Chapter 8
*Extra Credit: Yes EXCT 1.
*Project Description: The program has an abstract class that the subclass can inherit methods from to use in the subclass with specifications that fits the subclasses needs.
**/

package customersystem;

//driver class testing the compilation of subclasses
public class TestCustomerSystem {
	
	public static void main(String[] args) 
	{	
		//FlightCustomer objects created
		FlightCustomer flight1 = new FlightCustomer("Leo Lemons",29, 200.59);
		FlightCustomer flight2 = new FlightCustomer("Kim Hyolyn", 31, 650.25);
		FlightCustomer flight3 = new FlightCustomer("Fluffy Bottoms", 18, 90.43);
		
		
		System.out.println("*****************************");
		System.out.println("Testing FlightCustomer Class");
		System.out.println("*****************************");
		System.out.println();
		
		System.out.println("Testing FlightCustomer toString method:"); //testing FlightCustomer toString method
		System.out.println();
		System.out.println(flight1 + "\n\n" + flight2 + "\n\n" + flight3 + "\n");
		
		System.out.println("Testing FlightCustomer mutator methods:"); 
		//testing FlightCustomer mutators
		flight1.setName("King Arthur");
		flight1.setAge(1000);
		flight1.setTicketPrice(350.46);
		flight1.setSeatNumber(125);
		System.out.println("The name, age, ticket price, and seat number of the first flight customer has changed.\n");
		
		//testing FlightCustomer accessors
		System.out.println("Testing FlightCustomer accessor methods:");
		System.out.println("The name of the first flight customer has changed to: " + flight1.getName() +
							"\nThe age  of the first flight customer has changed to: " + flight1.getAge() +
							"\nThe ticket price of the first flight customer has changed to: " + flight1.getTicketPrice() +
							"\nThe seat number of the first flight customer has changed to: " + flight1.getSeatNumber());
		
		System.out.println();
		System.out.println("Testing FlightCustomer importanceLevel method: " +
							"\nRegular - $100 or less." +
							"\nBronze - Between $101 and $300." +
							"\nSilver - Between $301 and $600." +
							"\nGold - Between $601 or above.");
		//display of results of important level of the customers
		System.out.println("\nThe first flight customer is a " + flight1.importanceLevel() + "." +
							"\nThe second flight customer is a " + flight2.importanceLevel() + "." + 
							"\nThe third flight customer is a " + flight3.importanceLevel() + ".");
		
		 
		//RetailCustomer object creation
		RetailCustomer retail1 = new RetailCustomer("Meghan Baely", 42, 3, 20.22);
		RetailCustomer retail2 = new RetailCustomer("Tortilla Vapo", 30, 10, 100.64);
		RetailCustomer retail3 = new RetailCustomer("Shenhe Art", 20, 15, 300.50);
		
		System.out.println();
		System.out.println("*****************************");
		System.out.println("Testing RetailCustomer Class");
		System.out.println("*****************************");
		System.out.println();
		
		//testing toString method of RetailCustomer
		System.out.println("Testing RetailCustomer toString method:");
		System.out.println();
		System.out.println(retail1 + "\n\n" + retail2 + "\n\n" + retail3 + "\n");
		
		//testing mutator method of Retail Customer
		System.out.println("Testing RetailCustomer mutator methods:");
		retail2.setName("Hwaa Young");
		retail2.setAge(17);
		retail2.setItemsPurchased(40);
		retail2.setTotalSpent(57.29);
		System.out.println("The name, age, items purchased, and total spent of the second retail customer has changed.\n");
		
		//testing accessor method of RetailCustomer
		System.out.println("Testing RetailCustomer accessor methods:");
		System.out.println("The name of the second retail customer has changed to: " + retail2.getName() +
				"\nThe age  of the second retail customer has changed to: " + retail2.getAge() +
				"\nThe items purchased of the second retail customer has changed to: " + retail2.getItemsPurchased() +
				"\nThe total spent of the second retail customer has changed to: " + retail2.getTotalSpent());
		
		System.out.println();
		System.out.println("Testing RetailCustomer importanceLevel method: " +
							"\nRegular - $50 or less." +
							"\nBronze - Between $51 and $100." +
							"\nSilver - Between $101 and $200." +
							"\nGold - Between $201 or above.");
		//display of RetailCustomer importance level
		System.out.println("\nThe first retail customer is a " + retail1.importanceLevel() + "." +
							"\nThe second retail customer is a " + retail2.importanceLevel() + "." + 
							"\nThe third retail customer is a " + retail3.importanceLevel() + ".");
		



	}

}
