import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение размеров матриц
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Инициализация матриц
        int[][] A = new int[n][m];
        int[][] B = new int[n][m];
        int[][] C = new int[n][m]; // Результирующая матрица

        // Заполнение матрицы A
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // Заполнение матрицы B
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        // Вычисление суммы матриц
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // Вывод результата
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
