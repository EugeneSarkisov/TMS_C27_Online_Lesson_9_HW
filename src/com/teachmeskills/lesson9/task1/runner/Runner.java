package com.teachmeskills.lesson7.task_2.runner;

import com.teachmeskills.lesson7.task_2.figure.Circle;
import com.teachmeskills.lesson7.task_2.figure.Figure;
import com.teachmeskills.lesson7.task_2.figure.Rectangle;
import com.teachmeskills.lesson7.task_2.figure.Triangle;

public class Runner {
    public static void main(String[] args) {
        double perimeterSum = 0;

        Figure rectangle = new Rectangle("Rectangle", 4, 3.0, 4.0) ;
        Figure circle = new Circle("Circle", 1, 7.0);
        Figure triangle = new Triangle("Triangle", 3, 5.0, 5.0, 6.0);
        Figure rectangle2 = new Rectangle("Rectangle", 4, 6.0, 7.0) ;
        Figure triangle2 = new Triangle("Triangle", 3, 8.0, 8.0, 7.0);
        Figure[] figures = new Figure[]{rectangle, circle, triangle, rectangle2, triangle2};

        for(Figure figure : figures){
            figure.showInfo();
            System.out.println();
        }

        for(Figure figure : figures){
            perimeterSum += figure.calculatePerimeter();
        }
        System.out.println("Sum of figures perimeters: " + perimeterSum);
    }
}
