import java.util.*;
class Copy
{
	int roll_no;
	String name;
	Copy(int i,String s)
{
	roll_no=i;
	name=s;
}
	Copy(Copy s)
	{
		roll_no=s.roll_no;
		name=s.name;
	}
void display()
{
	System.out.println("Roll Number is :: "+roll_no);
	System.out.println("Name is :: "+name);
}
public static void main(String args[])
{
	Copy s1=new Copy(1,"ABC");
	Copy s2=new Copy(s1); //copy constructor invoked
	s1.display();
	s2.display();
	}
}