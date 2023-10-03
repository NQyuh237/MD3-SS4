package BT;

import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        int SIZE;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước của mảng: ");
        SIZE = scanner.nextInt();

        int[] arr = new int[SIZE];

        // Nhập giá trị
        System.out.println("Nhập giá trị cho các phần tử trong mảng:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // gán phần tử đầu tiên là giá trị nhỏ nhất
        int minValue = arr[0];

        // tìm giá trị nhỏ nhất
        for (int i = 1; i < SIZE; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }

        System.out.println("Giá trị nhỏ nhất trong mảng là: " + minValue);
    }
}