import java.util.*;
class Armstrong
{
	public static void main(String[] args)
	{

		system.out.println("Name :: Jigar Panara ");
		system.out.println("Enrollment Number :: 220130318017");

		Scanner sc = new Scanner(System.in);
		int num,check,sum=0,rem;
		System.out.print("Enter the Number : ");
		num = sc.nextInt();		
		check = num;
		while(num>0)
		{
			rem = num%10;
			sum = (rem*rem*rem)+sum;
			num = num/10;
		}
		if(check == sum)
		{
			System.out.print("Number is Armstrong Number : ) ");
		}
		else
		{
			System.out.print("Number is Not Armstrong Number : ) ");
		}
	}
}