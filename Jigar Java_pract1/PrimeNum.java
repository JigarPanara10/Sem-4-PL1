import java.util.*;
class PrimeNum
{
	public static void main(String[] args)
	{

		system.out.println("Name :: Jigar Panara ");
		system.out.println("Enrollment Number :: 220130318017");

		int n,flag=0,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		n = sc.nextInt();
		for(i=2;i<n;i++)
		{
			if(n % i == 0)
			{
				flag =0;
				break;
			}
			else
			{
				flag =1;
			}
		}	
		if(flag == 1)	
		{
			System.out.print("Number is Prime : "+n);
		}
		else
		{
			System.out.print("Number is Not prime : "+n);
	              	}			
	}
}