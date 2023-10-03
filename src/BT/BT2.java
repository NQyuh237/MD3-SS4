package BT;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.print("Nhập giá trị cần chèn (X): ");
        int X = scanner.nextInt();
        System.out.print("Nhập vị trí cần chèn (index từ 0 đến 9): ");
        int index = scanner.nextInt();
        if (index < 0 || index > array.length - 1) {
            System.out.println("Không thể chèn phần tử vào mảng. Vị trí không hợp lệ.");
        } else {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = X;
            System.out.println("Mảng sau khi chèn phần tử " + X + " vào vị trí " + index + ":");
            for (int num : array) {
                System.out.print(num + " ");
            }
        }
        scanner.close();
    }
}