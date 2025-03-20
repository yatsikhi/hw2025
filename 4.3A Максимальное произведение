import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                try {
                    arr[i][j] = scanner.nextInt();
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод данных!");
                    scanner.close();
                    return;
                }
            }
        }

        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    int product = arr[i][j];
                    if (product > maxProduct) {
                        maxProduct = product;
                    }
                }
            }

            if (maxProduct > Integer.MIN_VALUE) {
                System.out.println(maxProduct);
            } else {
                System.out.println("Не найдено максимальное произведение.");
            }
        }
    }
}
