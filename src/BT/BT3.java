package BT;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng thứ nhất: ");
        int size1 = input.nextInt();
        int[] array1 = new int[size1];

        System.out.print("Nhập các phần tử của mảng thứ nhất: ");
        for (int i = 0; i < size1; i++) {
            array1[i] = input.nextInt();
        }

        System.out.print("Nhập kích thước mảng thứ hai: ");
        int size2 = input.nextInt();
        int[] array2 = new int[size2];

        System.out.print("Nhập các phần tử của mảng thứ hai: ");
        for (int i = 0; i < size2; i++) {
            array2[i] = input.nextInt();
        }

        int size3 = size1 + size2;
        int[] array3 = new int[size3];

        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }

        for (int i = 0; i < size2; i++) {
            array3[size1 + i] = array2[i];
        }

        System.out.print("Mảng sau khi gộp: ");
        for (int i = 0; i < size3; i++) {
            System.out.print(array3[i] + " ");
        }

        input.close();
    }
}