package BT;

import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        String inputString = "Hello, World!";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ký tự cần đếm: ");
        char targetChar = scanner.next().charAt(0);

        int count = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetChar) {
                count++; // Tăng biến đếm lên 1 nếu tìm thấy ký tự trùng khớp
            }
        }

        System.out.println("Số lần xuất hiện của ký tự '" + targetChar + "' trong chuỗi là: " + count);
        scanner.close();
    }
}
