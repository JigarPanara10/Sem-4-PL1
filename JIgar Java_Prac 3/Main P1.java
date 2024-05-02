// Que - 1Write a Java Program to explain super keyword.


class Parent{
    int num = 15;
}

	// Subclass extending Parent class
	class Child extends Parent 
	{
		int num = 20;

		void display() 
		{
        		System.out.println("Child class num: " + num); // Accessing subclass variable
        		System.out.println("Parent class num: " + super.num); // Accessing superclass variable using super keyword
		}
	}

	// Main class
	public class MainP1
	{
		public static void main(String[] args)
		{
        		Child obj = new Child();
		obj.display();
		}
	}
