import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }



        

        bubbleSort(arr);

        long product1 = (long)arr[n - 1] * arr[n - 2] * arr[n - 3] * arr[n - 4];

        long product2 = (long)arr[0] * arr[1] * arr[n - 2] * arr[n - 1];


        long result = Math.max(product1, product2);

        System.out.println(result);
    }

    private static void bubbleSort(int[] arr) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
