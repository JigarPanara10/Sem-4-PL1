// Base class Shape
class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing a " + color + " shape");
    }

    public String getColor() {
        return color;
    }

    public String getInfo() {
        return "Color: " + color;
    }
}
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public String getInfo() {
        return super.getInfo() + ", Radius: " + radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    
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

    //Override
    public String getInfo() {
        return super.getInfo() + ", Base: " + base + ", Height: " + height;
    }
}

public class ShapeP12 {
    public static void main(String[] args) {
        Circle circle = new Circle("red", 5.0);
        System.out.println(circle.getInfo()); 

        Rectangle rectangle = new Rectangle("blue", 4.0, 3.0);
        System.out.println(rectangle.getInfo()); 

        Triangle triangle = new Triangle("green", 6.0, 4.0);
        System.out.println(triangle.getInfo()); 
    }
}
 	