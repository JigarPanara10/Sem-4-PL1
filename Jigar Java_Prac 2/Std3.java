class Std2
{
	int roll_no;
	Std2(int i)
	{
	roll_no=i;
	}
	//return true if it is equal to the invoking object
	
	boolean equals(Std2 s)
	{
	if(roll_no==s.roll_no)
		return true;
	else
		return false;
	}
}
class Std3
{
	public static void main(String args[])
	{
	Std2 s1=new Std2(10);
	Std2 s2=new Std2(10);
	Std2 s3=new Std2(20);
	System.out.println("Koradiya Khush");
	System.out.println("ER. NO. 220130318018");

	System.out.println("s1==s2 :: "+s1.equals(s2));
	System.out.println("s1==s3 :: "+s1.equals(s3));
	}
}