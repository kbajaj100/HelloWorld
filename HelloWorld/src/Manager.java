
public class Manager extends Employee //Employee is the super class
{
	private String department;
	
	Manager(String n, int s, String d)
	{
		super(n,s); // Calling the constructor for the super class
		department = d;
	}
	
	public String getDepartment()
	{
		return department;
	}
	
	//overriding a method that is in a superclass
	
	
}
