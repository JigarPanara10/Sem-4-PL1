abstract class Shape {
    protected int numberOfSides;

    public abstract double calculateArea();
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    // Override
    public double calculateArea() {
        return length * width;
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Override
    public double calculateArea() {
        return (base * height) / 2;
    }
}

public class ShapeTesterP15 {

    public static void printShapeArea(Shape shape) {
        System.out.println("Area of the shape: " + shape.calculateArea());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        Triangle triangle = new Triangle(4.0, 6.0);

        System.out.println("Rectangle:");
        printShapeArea(rectangle);

        System.out.println("Triangle:");
        printShapeArea(triangle);
    }
}
