package com.solid;

public class Program {
    public static void main(String[] args) {
        I2DShape circle = new Circle(5);
        I2DShape rectangle = new Rectangle(10, 20);
        I2DShape square = new Square(5);
        I3DShape cube = new Cube(10);

        System.out.println(cube.getVolume());
        System.out.println(rectangle.getArea());
        System.out.println(circle.getArea());
        System.out.println(square.getArea());

        Printer.print(circle);
        Printer.print(rectangle);
        Printer.print(square);
        Printer.print(cube);
    }
}
