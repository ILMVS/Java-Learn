//LISKOV.java

// Problem: The original code violates Liskov Substitution Principle because subclasses inherit irrelevant fields and behavior.
// Solution: Use an interface and let each shape define only the fields it needs.

//Almost same solution as OpenClose.java, but with Liskov Substitution Principle applied.

//also we didnt need an abstract class here, just an interface.

import java.util.ArrayList;
import java.util.List;

// Main class
public class LISKOV {
    public static void main(String[] args) {
        List<IShape> shapes = new ArrayList<>();
        shapes.add(new Square2(5));
        shapes.add(new Circle2(3));
        shapes.add(new Triangle2(4, 6));
        for (IShape shape : shapes) {
            System.out.println("Area: " + shape.area());
        }
    }
}

// Interface for shapes
interface IShape {
    double area();
}

// Square class only needs side
class Square2 implements IShape {
    private double side;
    public Square2(double side) {
        this.side = side;
    }
    @Override
    public double area() {
        return side * side;
    }
}

// Circle class only needs radius
class Circle2 implements IShape {
    private double radius;
    public Circle2(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Triangle class needs base and height
class Triangle2 implements IShape {
    private double base, height;
    public Triangle2(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public double area() {
        return (base * height) / 2;
    }
}