public class PatternStar2  
{    
	public static void main(String args[])   
	{    

		system.out.println("Name :: Jigar Panara ");
		system.out.println("Enrollment Number :: 220130318017");

		int i, j, row = 6;       
		for (i=0; i<row; i++)   
		{  
			for (j=2*(row-i); j>=0; j--)         
			{  
				System.out.print(" ");   
			}   
			for (j=0; j<=i; j++ )   
			{   
				System.out.print("* ");   
			}   
			System.out.println();   
		}   
	}   
}