class Shape {
    protected String color;

    // Constructor with color parameter
    public Shape(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing a " + color + " shape");
    }

    // Getter method for color
    public String getColor() {
        return color;
    }
}

// Subclass Circle
class Circle extends Shape {
    public Circle(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + getColor() + " circle");
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    public Rectangle(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + getColor() + " rectangle");
    }
}

// Subclass Triangle
class Triangle extends Shape {
    public Triangle(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + getColor() + " triangle");
    }
}

public class ShapeP11{
    public static void main(String[] args) {
        Circle circle = new Circle("red");
        circle.draw(); 

        Rectangle rectangle = new Rectangle("blue");
        rectangle.draw(); 

        Triangle triangle = new Triangle("green");
        triangle.draw(); 
    }
}