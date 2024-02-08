package com.teachmeskills.lesson9.task2.utils;

/**
 * This class contain method "arrOut" for printing matrix.
 */

public class Utils {
    public static void arrOut(int[][] arr){
        for (int[] arrays : arr){
            for (int data : arrays){
                System.out.print(data + " ");
            }
            System.out.println();
        }
    }
}
