//We have a class called shapes that calculates the area of different shapes but it violates the Open/Closed Principle.

import java.util.ArrayList;
import java.util.List;

public class OpenClose {
    public static void main(String[] args) {
        List<IAbstractShape> shapes = new ArrayList<>();
        shapes.add(new Square(5, 5));
        shapes.add(new Circle(3));
        shapes.add(new Triangle(4, 6));
        shapes.add(new Rectangle(4, 8));
        for (IAbstractShape shape : shapes) {
            System.out.println("Area: " + shape.area());
        }
    }
}

// This class violates the Open/Closed Principle because it is not open for extension.
//class shapes{
//    public double high,width,radius;
//    public shapes(double high, double width, double radius) {
//        this.high = high;
//        this.width = width;
//        this.radius = radius;
//    }
//
//    public double squareArea() {
//        return high* width;
//    }
//    public double circleArea() {
//        return Math.PI * radius * radius;
//    }
//    public double triangleArea() {
//        return (high * width) / 2;
//    }
//    public double rectangleArea() {
//        return high * width;
//    }
//
//}

interface  IAbstractShape {
    double area();
}

//the abstract class is not needed, but it is used to demonstrate the Open/Closed Principle.
// We can extend this class to add new shapes without modifying the existing code.

//we can see it in generic repositories, where we can create a generic repository that can be used for any entity.
//coz th CRUD operations are the same for all entities.

abstract class  abstractShape implements IAbstractShape {
    public double high, width, radius;

    public abstractShape(double high, double width, double radius) {
        this.high = high;
        this.width = width;
        this.radius = radius;
    }
    public abstractShape(double high, double width) {
        this.high = high;
        this.width = width;
    }
    public abstractShape(double radius) {
        this.radius = radius;
    }

    public abstract double area();
}

class Square extends abstractShape {
    public Square(double high, double width) {
        super(high, width);
    }

    @Override
    public double area() {
        return high * width;
    }
}

class Rectangle extends Square {
    public Rectangle(double high, double width) {
        super(high, width);
    }

    @Override
    public double area() {
        return high * width;
    }
}

class Circle extends abstractShape {
    public Circle(double radius) {
        super(radius);
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends abstractShape {
    public Triangle(double high, double width) {
        super(high, width);
    }

    @Override
    public double area() {
        return (high * width) / 2;
    }
}