package instance_method;

public class Robot1 {
	 void walk()
	    {
	       System.out.println("walked");
	    }
	    void run()
	    {
	    	System.out.println("runned");
	    }

	public static void main(String[] args) 
	{
		new Robot1().walk();// instant calling method using instant class
		new Robot1().run();


	}

}
