package import_method;

import class_method.RobotB;
import instance_method.RobotA;
import parameter.RobotC;

public class RobotD 
{
	public static void main(String[] args) 
	{
		
		new RobotA().walk();
		new RobotA().run();
		RobotC obj=new RobotC();
		obj.walk(5);
		RobotB.walk();
		RobotB.run();
	}
}
