package com.devmello.midterm.problem2;
import java.util.Scanner;
public class Matrix {
    static int i;
    static int j;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = input.nextInt();
        System.out.println("Enter the character to fill: ");
        char fill = input.next().charAt(0);
        System.out.println("Matrix x:");
        System.out.println();
        printXMatrix(rows, columns);
        System.out.println();
        System.out.printf("Matrix x and %c :%n", fill);
        System.out.println();
        printInside1(rows, columns, fill);
    }
    public static void printXMatrix(int m, int n) {
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
    public static void printInside1(int m, int n, char fill) {
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    System.out.print("x ");
                } else {
                    System.out.print(fill + " ");
                }
            }
            System.out.println();
        }
    }
}
