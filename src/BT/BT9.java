package BT;

public class BT9 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 15};
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2 && arr[i] != max) {
                max2 = arr[i];
            }
        }

        if (max2 != Integer.MIN_VALUE) {
            System.out.println("Phần tử lớn thứ 2 trong mảng là: " + max2);
        } else {
            System.out.println("Không tìm thấy phần tử lớn thứ 2 trong mảng.");
        }
    }
}

