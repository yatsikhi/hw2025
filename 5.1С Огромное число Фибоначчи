import java.util.Scanner;

public class FibonacciModulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong(); // Читаем n
        int m = scanner.nextInt();   // Читаем m

        System.out.println(fibonacciMod(n, m)); // Выводим результат
    }

    private static int fibonacciMod(long n, int m) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // Последовательность остатков
        int prev = 0;
        int curr = 1;
        int next;

        for (long i = 2; i <= n; i++) {
            next = (prev + curr) % m;
            prev = curr;
            curr = next;
        }

        return curr;
    }
}
