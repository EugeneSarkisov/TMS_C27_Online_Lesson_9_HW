package com.teachmeskills.lesson7.task_2.figure;

/**
 * This class extends abstract class "Figure", contain pattern
 * for "Circle" objects and initialize methods.
 */

public class Circle extends Figure {
    double radius;
    final double pi = 3.14;

    public Circle(String shape, int sideCount, double radius) {
        super(shape, sideCount);
        this.radius = radius;
    }

    @Override
    public double calculateSquare() {
        return pi * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * pi * radius;
    }

    @Override
    public void showInfo() {
        System.out.print(shape + ", Count of sides: " + sideCount);
        System.out.println();
        System.out.print("Radius: " + radius + " cm");
        System.out.println();
        System.out.print("Square: " + calculateSquare() + " square cm");
        System.out.println();
        System.out.println("Perimeter: " + calculatePerimeter() + " cm");
    }
}
