package BT;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng của ma trận: ");
        int numRows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int numCols = scanner.nextInt();

        double[][] matrix = new double[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Nhập giá trị cho hàng " + (i + 1) + " cột " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        double maxElement = matrix[0][0];
        int rowOfMaxElement = 0;
        int colOfMaxElement = 0;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                    rowOfMaxElement = i;
                    colOfMaxElement = j;
                }
            }
        }

        System.out.println("Phần tử lớn nhất trong ma trận là " + maxElement);
        System.out.println("Tọa độ của phần tử lớn nhất là hàng " + (rowOfMaxElement + 1) + ", cột " + (colOfMaxElement + 1));
        scanner.close();
    }
}