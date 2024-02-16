import java.util.*;
class Dowhileloop
{
	public static void main(String[] args)
	{	

		system.out.println("Name :: Jigar Panara ");
		system.out.println("Enrollment Number :: 220130318017");

		int n,i,max;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Element of th number : ");
		i=0;	
		do{
			arr[i] = sc.nextInt();
			i++;
		}while(i<n);
		i=0;	
		do{
			System.out.println(" Index of arr["+i+"] Array Element is : "+arr[i]);
			i++;
		}while(i<n);
		max = arr[0];
		i=0;
		do{
			if(max<arr[i])
			{
				max =arr[i];
			}
			i++;
		}while(i<n);
		System.out.print("Maximum Number is "+max);
	}
}