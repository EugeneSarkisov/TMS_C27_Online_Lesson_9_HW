package com.teachmeskills.lesson7.task_2.figure;

/**
 * This abstract class contains pattern for all "Figure" objects
 * and declare their methods.
 */

public abstract class Figure {
    String shape;
    final int sideCount;

    public Figure(String shape, int sideCount) {
        this.shape = shape;
        this.sideCount = sideCount;
    }

    public abstract double calculateSquare();
    public abstract double calculatePerimeter();
    public abstract void showInfo();
}

