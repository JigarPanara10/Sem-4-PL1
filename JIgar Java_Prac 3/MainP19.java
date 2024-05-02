// Shape interface
interface Shape {
    double getArea();
    double getPerimeter();
}

// Rectangle class implementing Shape interface
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //Override
    public double getArea() {
        return length * width;
    }

    //Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
public class MainP19 {
    public static void main(String[] args) 
{
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
    }
}

