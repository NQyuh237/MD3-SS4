package BT;

import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matrix = {
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0},
                {7.0, 8.0, 9.0}
        };

        double diagonalSum = 0.0;

        for (int i = 0; i < matrix.length; i++) {
            diagonalSum += matrix[i][i];
        }

        System.out.println("Tổng của các số ở đường chéo chính là: " + diagonalSum);

        System.out.print("Nhập kích thước của ma trận vuông: ");
        int size = scanner.nextInt();

        double[][] userMatrix = new double[size][size];

        System.out.println("Nhập giá trị cho ma trận:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhập giá trị cho hàng " + (i + 1) + ", cột " + (j + 1) + ": ");
                userMatrix[i][j] = scanner.nextDouble();
            }
        }

        double userDiagonalSum = 0.0;

        for (int i = 0; i < size; i++) {
            userDiagonalSum += userMatrix[i][i];
        }

        System.out.println("Tổng của các số ở đường chéo chính là: " + userDiagonalSum);
    }
}
