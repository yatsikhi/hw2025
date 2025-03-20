import java.util.Scanner;

public class SumOfFibonacciLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(sumOfFibonacciLastDigits(n));
    }

    private static int sumOfFibonacciLastDigits(int n) {
        if (n == 0) {
            return 0;
        }

        int previousLastDigit = 0;
        int currentLastDigit = 1;
        int totalSum = 1; // Сумма включает F_1 = 1

        for (int i = 2; i <= n; i++) {
            int nextLastDigit = (previousLastDigit + currentLastDigit) % 10;
            totalSum += nextLastDigit;
            totalSum %= 10; // Обновляем сумму, оставляя только последнюю цифру

            previousLastDigit = currentLastDigit;
            currentLastDigit = nextLastDigit;
        }

        return totalSum;
    }
}
