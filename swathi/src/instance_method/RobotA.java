package instance_method;

public class RobotA 
{
	// Imported to another class-imported method
	
	public void walk()
	{
		System.out.println("walk executed");
		
	}

	public void run()

	{
		
		System.out.println("run executed");
	}

		public static void main(String[] args) 
		{
			new RobotA().walk();// instant calling method using instant class
			new RobotA().run();
		}
}
