package parameter;

public class Robot3 
{
	void walk(int km)
	{
		System.out.println("8");
	}
	     int getspeed()
	{
	    return 20;	
	}
		public static void main(String[] args) 
		{
			
	     Robot3 obj=new Robot3();
	      obj.walk(8);
	       int speed=obj.getspeed();
	      System.out.println("robot retuned in as="+speed);
}
}
