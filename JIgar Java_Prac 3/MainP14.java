abstract class Shape {
    protected int numberOfSides; 
    public abstract double calculateArea();
}
class Triangle extends Shape {
    private double base; 
    private double height; 
    public Triangle(double base, double height) 
{	
        this.numberOfSides = 3; 
        this.base = base;
        this.height = height;
    }
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
public class MainP14{
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 8); 	
        System.out.println("Triangle Area: " + triangle.calculateArea());
	System.out.println("Number of Sides are ::"+triangle.numberOfSides);
    }

     
}