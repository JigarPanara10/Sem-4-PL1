import java.util.*;
class CircleArea
{
	double area;
	CircleArea(double r)
	{
	 area= 3.14*r*r;
 
	}
}
class Circle
{
   public static void main(String args[]) 
    {   
      Scanner sc= new Scanner(System.in);
	System.out.println("Koradiya Khush");
	System.out.println("ER. NO. 220130318018");
      System.out.print("Enter the radius of circle::");
      double radius= sc.nextDouble();      
      CircleArea obj =new CircleArea(radius);
	System.out.println("Area of Circle is " + obj.area);      
   }
 }