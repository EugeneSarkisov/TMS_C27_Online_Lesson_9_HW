package com.teachmeskills.lesson7.task_2.figure;

/**
 * This class extends abstract class "Figure" and contain pattern
 * for "Triangle" objects and initialize methods.
 */

public class Triangle extends Figure {
    double sideLeft;
    double sideRight;
    double sideBottom;

    public Triangle(String shape, int sideCount, double sideLeft, double sideRight, double sideBottom) {
        super(shape, sideCount);
        this.sideLeft = sideLeft;
        this.sideRight = sideRight;
        this.sideBottom = sideBottom;
    }

    @Override
    public double calculateSquare() {
        double halfPerm = (sideLeft + sideRight + sideBottom) / 2;
        return Math.sqrt(halfPerm * (halfPerm - sideRight) *
                (halfPerm - sideBottom) * (halfPerm - sideLeft));
    }

    @Override
    public double calculatePerimeter() {
        return sideLeft + sideRight + sideBottom;
    }

    @Override
    public void showInfo() {
        System.out.print(shape + ", Count of sides: " + sideCount);
        System.out.println();
        System.out.print("Left side: " + sideLeft + " cm," + " Right side: " + sideRight + " cm," +
                " Bottom side: " + sideBottom + " cm");
        System.out.println();
        System.out.print("Square: " + calculateSquare() + " square cm");
        System.out.println();
        System.out.println("Perimeter: " + calculatePerimeter() + " cm");
    }
}
