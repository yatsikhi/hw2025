import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(lcm(a, b));
    }

    // Функция для вычисления НОД с использованием алгоритма Евклида
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Функция для вычисления НОК
    private static long lcm(int a, int b) {
        return Math.abs((long)a * b) / gcd(a, b);
    }
}
