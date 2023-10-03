package BT;

import java.util.Arrays;
import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử trong mảng: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Số phần tử trong mảng phải lớn hơn 0.");
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        // nhập số cần xóa khỏi mảng
        System.out.print("Nhập vào số cần xóa: ");
        int x = sc.nextInt();
        // ktra xem số cần xóa có tồn tại trong mảng hay không
        boolean found = false;
        // tìm số cần xóa và thực hiện xóa nếu tìm thấy
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                found = true;
                // Duyệt các phần tử sau phần tử được tìm thấy và di chuyển chúng về trái
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                n--;
                break;
            }
        }
        if (!found) {
            System.out.println("Số " + x + " không thuộc mảng.");
        } else {
            // In mảng sau khi xóa phần tử và chỉ hiển thị phần tử còn lại
            System.out.println("Mảng sau khi xóa phần tử " + x + ":");
            System.out.println(Arrays.toString(Arrays.copyOf(arr, n)));
        }
    }
}