package BT;

import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matrix = {
                {1.5, 2.5, 3.5},
                {4.5, 5.5, 6.5},
                {7.5, 8.5, 9.5}
        };

        System.out.print("Nhập thứ tự của cột để tính tổng (tính từ 0): ");
        int columnIndex = scanner.nextInt();

        double columnSum = 0.0;

        for (int i = 0; i < matrix.length; i++) {
            if (columnIndex >= 0 && columnIndex < matrix[i].length) {
                columnSum += matrix[i][columnIndex];
            } else {
                System.out.println("Thứ tự của cột không hợp lệ.");
                return;
            }
        }

        System.out.println("Tổng của cột " + columnIndex + " là: " + columnSum);

        System.out.print("Nhập số hàng của mảng: ");
        int numRows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int numCols = scanner.nextInt();

        double[][] userMatrix = new double[numRows][numCols];

        System.out.println("Nhập giá trị cho mảng:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Nhập giá trị cho hàng " + i + ", cột " + j + ": ");
                userMatrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Mảng bạn vừa nhập:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(userMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
