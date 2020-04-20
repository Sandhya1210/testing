package Loops;

public class For_Loop {

	public static void main(String[] args) 
	{
		/*
		 * Example:-- Print number from 1 to 10
		 */
				for (int i = 0; i <10; i++) // initiation; condition;increment/decrement
				{
					System.out.println(i);
				}
				
				System.out.println("iteration finished");
				
		
		
		/*
		 * Example:--> Print number from 10 t0 1
		 */
				for (int i = 10; i > 0; i--) 
				{
					System.out.println(i);
				}
				System.out.println("iteration finished");
				
				
				
		/*
		 * Example:--> Conduct sum between 1 to 100
		 */
				int sum=0;
				for (int i = 1; i <= 100; i++) 
				{
					sum=sum+i;
				}
				System.out.println("Total value is => "+sum);
				
				
				
		/*
		 * Example:--> Print all array items	
		 */
				String toolname[]= {"IDE","RC","WD","GRID"};
				//Iterate for number of array items
				for (int i = 0; i < toolname.length; i++) 
				{
					System.out.println(toolname[i]);
				}
				
				
				/*
				 * example:---> print all array items
				 */ 
				String toolname1[]= {"10","20","30"};
				// iterate for number of array items
				for (int i = 0; i < toolname1.length; i++) 
				{
					System.out.println(toolname1[i]);
				}
					
				}
				
	
	
}
