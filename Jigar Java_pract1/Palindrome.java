import java.util.*;
class Palindrome
{
	public static void main(String[] args)
	{

		system.out.println("Name :: Jigar Panara ");
		system.out.println("Enrollment Number :: 220130318017");

		Scanner sc = new Scanner(System.in);
		int n,c,r,sum=0;
		System.out.print("Enter the Number  ::  ");
		n = sc.nextInt();
		c =n;
		while(n>0)
		{
			r = n%10;
			sum = r+(sum*10);
			n = n/10;	
		}
		if(c == sum)
		{
			System.out.print("Number is Palindrome : ) ");
		}	
		else
		{	
			System.out.print("Number is Not Palindrome : ) ");
		}
	}
}