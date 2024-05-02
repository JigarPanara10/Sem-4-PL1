// Base class Shape
abstract class Shape {
    protected String color;

    // Constructor with color parameter
    public Shape(String color) {
        this.color = color;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    // Getter method for color
    public String getColor() {
        return color;
    }

    // Method to get shape information
    public String getInfo() {
        return "Color: " + color;
    }
}

// Subclass Circle
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Radius: " + radius;
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Width: " + width + ", Height: " + height;
    }
}

// Subclass Triangle
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        // Assuming it's an equilateral triangle for simplicity
        return 3 * base;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Base: " + base + ", Height: " + height;
    }
}

// Main class to test the shape hierarchy
public class ShapeTestP13 {
    public static void main(String[] args) {
        Circle circle = new Circle("red", 5.0);
        System.out.println("Circle Info: " + circle.getInfo());
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        Rectangle rectangle = new Rectangle("blue", 4.0, 3.0);
        System.out.println("Rectangle Info: " + rectangle.getInfo());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        Triangle triangle = new Triangle("green", 6.0, 4.0);
        System.out.println("Triangle Info: " + triangle.getInfo());
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}