import java.util.Scanner;
public class Reverse
{
    public static void main(String args[])
    {

	system.out.println("Name :: Jigar Panara ");
	system.out.println("Enrollment Number :: 220130318017");

        int m, n, rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        m = sc.nextInt();
        while(m > 0)
        {
            n = m % 10;
            rev = rev * 10 + n;
            m = m / 10;
        }
        System.out.println("Reverse of a Number is :: "+rev);
    }
}