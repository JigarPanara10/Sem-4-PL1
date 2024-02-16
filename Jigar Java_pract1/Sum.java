import java.util.*;
class Sum{
    	public static void main(String[] args) 
	{

		system.out.println("Name :: Jigar Panara ");
		system.out.println("Enrollment Number :: 220130318017");

    		Scanner sc = new Scanner(System.in);
    		int a=10,b=20,c=30,sum=0;
	    	float avg;
    		System.out.print("Enter the Value of A : ");
    		a = sc.nextInt();
    		System.out.print("Enter the Value of B : ");
    		b = sc.nextInt();
    		System.out.print("Enter the Value of C : ");
    		c = sc.nextInt();
    		System.out.println("Value of A : "+a);
    		System.out.println("Value of B : "+b);
    		System.out.println("Value of C : "+c);
    		sum = a+b+c;
    		System.out.println("Sum of three Numbers : "+sum);
    		avg = (float)sum/3;
    		System.out.println("Avgerage  : "+avg);
   	} 
}