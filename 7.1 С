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

        // Поиск количества индексов для каждого элемента массива Q
        for (int i = 0; i < m; i++) {
            int count = findCountOfOccurrences(K, Q[i]);
            System.out.println(count);
        }

        scanner.close();
    }

    private static int findCountOfOccurrences(int[] arr, int target) {
        int leftIndex = lowerBound(arr, target);
        if (leftIndex == arr.length || arr[leftIndex] != target) {
            return 0;
        }

        int rightIndex = upperBound(arr, target);

        return rightIndex - leftIndex;
    }

    private static int lowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private static int upperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
