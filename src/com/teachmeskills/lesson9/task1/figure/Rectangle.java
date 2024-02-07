package com.teachmeskills.lesson7.task_2.figure;

/**
 * This class extends abstract class "Figure" and contain pattern
 * for "Rectangle" objects and initialize methods.
 */

public class Rectangle extends Figure {
    double height;
    double width;

    public Rectangle(String shape, int sideCount, double height, double width) {
        super(shape, sideCount);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateSquare() {
        return (height * width) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (height + width);
    }

    @Override
    public void showInfo() {
        System.out.print(shape + ", Count of sides: " + sideCount);
        System.out.println();
        System.out.print("Height: " + height + " cm," + " Width: " + width + " cm");
        System.out.println();
        System.out.print("Square: " + calculateSquare() + " square cm");
        System.out.println();
        System.out.println("Perimeter: " + calculatePerimeter() + " cm");
    }
}
