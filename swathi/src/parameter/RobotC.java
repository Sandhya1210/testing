package parameter;

public class RobotC 
{
	 public void walk(int km)

	{
		System.out.println("5");
	}
	public  int getspeed()
	{
		return 10;
	}
	public static void main(String[] args) 
	
{
		RobotC obj=new RobotC();
		obj.walk(5);
		int speed=obj.getspeed();
		System.out.println("robot retuned in as="+speed);
		
				

	}

}
