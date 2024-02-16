import java.util.*;
class Next_salary
{
	public static void main(String[] args)
	{

	system.out.println("Name :: Jigar Panara ");
	system.out.println("Enrollment Number :: 220130318017");

	double bs,da,hra,ts;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Basic Salary : ");
	bs = sc.nextDouble();
	if(bs<1500)
	{
		hra = bs*10/100;
		da = bs*90/100;
	}
	else
	{
		hra = 500;
		da = bs*98/100;
	}
	ts = bs+hra+da;
	System.out.print("Total Salary : "+ts);

	}
}