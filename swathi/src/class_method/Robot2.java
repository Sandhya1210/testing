package class_method;

public class Robot2 
{
    static void walk()
    {
   	 System.out.println("executed as walk");
    }
    
    static void run()
{
   System.out.println("executed as run");	 
}
	public static void main(String[] args) 
	{
     walk();     //class calling method using classmethod,
     run();      //when it is in static both we donot mention classname like Robot2
     
	}
}
