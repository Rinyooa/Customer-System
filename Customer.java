package customersystem;

public abstract class Customer //creation of abstract class
{
	// protected variables so subclasses in the same package can have access to it
	protected String name; 
	protected int age;
	
	public Customer(String name, int age)
	{
		this.name = name;
		this.age = age ;
	}
	
	//abstract method to use in subclasses later
	public abstract String importanceLevel();
	
	//mutator methods
	public void setName(String name)
	{this.name = name;}
	
	public void setAge(int age)
	{this.age = age;}
	
	//accessor methods
	public String getName()
	{return name;}
	
	public int getAge()
	{return age;}
	
	//tostring method
	public String toString()
	{
		return "Name: " + name + 
				"/nAge: " + age ;
	}

}
