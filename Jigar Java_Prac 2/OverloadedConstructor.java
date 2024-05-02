 public class OverloadedConstructor
{
	public static void main(String[] args)
	{
		add a = new add();
		add b = new add(4,6);
	}
}
class add
{
	add()
	{
		System.out.println("Koradiya Khush");
		System.out.println("ER. NO. 220130318018");
		System.out.println("Default Constructor (sum of 3 + 15 is )::"+(3+15));
	}
	add(int a, int b)
	{
		System.out.println("Parameterized Constructor (sum of 4 + 6 is ) ::"+(a+b));	
	}
}