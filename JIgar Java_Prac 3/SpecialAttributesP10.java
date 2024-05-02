class Shape {
    public double calculateArea() {
        return 0;
}

    public double calculatePerimeter() {
        return 0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    //Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Override
    public double calculateArea() {
        return width * height;
    }

    //Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    //Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    //Override
    public double calculatePerimeter() 
{
        return 3 * base;
    }
}

public class SpecialAttributesP10 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        Triangle triangle = new Triangle(3, 4);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}