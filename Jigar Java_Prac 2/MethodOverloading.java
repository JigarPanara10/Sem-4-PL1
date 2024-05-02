class MethodOverloading
{
	public int add(int x,int y)
	{
	return x+y;
	}
	public double add(double x,double y)
	{
	return x+y;
	}
	public int add(int x,int y,int z)
	{
	return x+y+z;
	}

public static void main(String args[])
{
	MethodOverloading m=new MethodOverloading();
	int sum1=m.add(5,10);
	System.out.println("Koradiya Khush");
	System.out.println("ER. NO. 220130318018");

	System.out.println("Sum of two integers :: "+sum1);
	double sum2=m.add(3.5,2.5);
	System.out.println("Sum of two doubles :: "+sum2);
	int sum3=m.add(1,2,3);
	System.out.println("Sum of three integers :: "+sum3);
	}
}