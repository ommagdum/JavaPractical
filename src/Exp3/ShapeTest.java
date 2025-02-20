package Exp3;
/*
Create abstract class Shape which has instance variables side, area and perimeter And methods
calculateArea(), calculatePerimeter() as abstract methods and display() as concrete method. Write subclasses which
extend Shape class like Triangle, Rectangle, Circle , Cube and Square and override abstract methods and display
methods in subclass take instance variable if needed as per the formula. And use parameterized constructor to initialize
instance variables using “this” reference variable
Write Test class and Create a reference variable of Shape which will hold the objects of all the subclasses and calculate
respective area, perimeter and display the results.
 */

abstract class Shape{
    public double side, area, perimeter;

    abstract double calculateArea();
    abstract double calculatePerimeter();
    abstract void display();
}

class Triangle extends Shape {
    Triangle(double side){
        this.side = side;
    }

    double calculateArea(){
        this.area = 0.5 * this.side * this.side;
        return this.area;
    }

    double calculatePerimeter(){
        this.perimeter = 3 * this.side;
        return this.perimeter;
    }

    void display(){
        System.out.println("Area Of Triangle : "+calculateArea());
        System.out.println("Perimeter Of Triangle : "+calculatePerimeter());
        System.out.println();
    }

}

class Rectangle extends Shape {
    public double side1, side2;
    Rectangle(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    double calculateArea(){
        this.area = this.side1 * this.side2;
        return this.area;
    }

    double calculatePerimeter(){
        this.perimeter = 2*(this.side1 + this.side2);
        return this.perimeter;
    }

    void display(){
        System.out.println("Area Of Rectangle : "+calculateArea());
        System.out.println("Perimeter Of Rectangle : "+calculatePerimeter());
        System.out.println();
    }

}

class Circle extends Shape {
    public double radius;
    Circle(double radius){
        this.radius = radius;
    }

    double calculateArea(){
        this.area = 3.14 * this.radius * this.radius;
        return this.area;
    }

    double calculatePerimeter(){
        this.perimeter = 2 * 3.14 * this.radius;
        return this.perimeter;
    }
    void display(){
        System.out.println("Area Of Circle : "+calculateArea());
        System.out.println("Perimeter Of Circle : "+calculatePerimeter());
        System.out.println();
    }

}

class Square extends Shape {
    Square(double side){
        this.side = side;
    }

    double calculateArea(){
        this.area = this.side * this.side;
        return this.area;
    }

    double calculatePerimeter(){
        this.perimeter = 4 * this.side;
        return this.perimeter;
    }

    void display(){
        System.out.println("Area Of Square : "+calculateArea());
        System.out.println("Perimeter Of Square : "+calculatePerimeter());
        System.out.println();
    }

}

class Cube extends Shape {
    Cube(double side){
        this.side = side;
    }

    double calculateArea(){
        this.area = 6 * this.side * this.side;
        return this.area;
    }

    double calculatePerimeter(){
        this.perimeter = 12 * this.side;
        return this.perimeter;
    }

    void display(){
        System.out.println("Area Of Cube : "+calculateArea());
        System.out.println("Perimeter Of Cube : "+calculatePerimeter());
        System.out.println();
    }

}

public class ShapeTest {
    public static void main(String[] args){

        Triangle t = new Triangle(5);
        t.display();

        Rectangle r = new Rectangle(3,4);
        r.display();

        Circle c = new Circle(4);
        c.display();

        Square s = new Square(6);
        s.display();

        Cube cube = new Cube(4);
        cube.display();
    }
}