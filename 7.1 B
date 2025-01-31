import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размера массива K
        int n = scanner.nextInt();

        // Ввод отсортированного массива K
        int[] K = new int[n];
        for (int i = 0; i < n; i++) {
            K[i] = scanner.nextInt();
        }

        // Ввод размера массива Q
        int m = scanner.nextInt();

        // Ввод массива Q
        int[] Q = new int[m];
        for (int i = 0; i < m; i++) {
            Q[i] = scanner.nextInt();
        }

        // Поиск индексов элементов массива Q в массиве K
        for (int i = 0; i < m; i++) {
            int index = binarySearch(K, Q[i]);
            System.out.println(index);
        }

        scanner.close();
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
