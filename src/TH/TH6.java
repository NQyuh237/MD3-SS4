package TH;

import java.util.Scanner;

public class TH6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        // Ensure that the size is valid (not exceeding 30)
        do {
            System.out.print("Nhập số lượng học sinh (không quá 30): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Đâu vao không hợp lệ. Vui lòng nhập một số nguyên hợp lệ.");
                scanner.next();
            }
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Kích thước không được vượt quá 30");
        } while (size > 30);

        int[] array = new int[size];

        // Input marks for each student
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập điểm cho học sinh " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Đâu vao không hợp lệ. Vui lòng nhập một số nguyên hợp lệ.");
                scanner.next(); // Consume the invalid input
            }
            array[i] = scanner.nextInt();
        }

        // Count the number of students passing the exam
        int count = 0;
        System.out.print("Danh sách các dấu hiệu: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }

        System.out.println("\nSố học sinh đỗ kỳ thi là " + count);
    }
}
