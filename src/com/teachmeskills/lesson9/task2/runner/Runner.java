package com.teachmeskills.lesson9.task2;

public class Runner {
    public static void main(String[] args) {
        int tempVar = 0;
        int arrCol = 0;
        int arrLine = 0;
        int[][] arrFinal = new int[3][3];
        int[][] arr1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] arr2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        while (arrCol != 3) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 4; k++) {
                        tempVar += arr1[i][k] * arr2[k][j];
                    }
                    arrFinal[arrCol][arrLine] = tempVar;
                    arrLine++;
                    tempVar = 0;
                }
                arrCol++;
                arrLine = 0;
            }
        }

        for (int i = 0; i < arrFinal.length; i++) {
            for (int j = 0; j < arrFinal.length; j++) {
                System.out.print(arrFinal[i][j] + " ");
            }
            System.out.println();
        }
    }
}


