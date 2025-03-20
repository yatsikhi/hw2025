import java.util.Scanner;

public class SumRangeFibonacciLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println(sumRangeFibonacciLastDigits(m, n));
    }

    private static int sumRangeFibonacciLastDigits(int m, int n) {
        if (m > n || m < 0 || n < 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int previousLastDigit = 0;
        int currentLastDigit = 1;
        int totalSum = 0;

        for (int i = 0; i <= n; i++) {
            if (i >= m) {
                totalSum += currentLastDigit;
                totalSum %= 10;
            }

            int nextLastDigit = (previousLastDigit + currentLastDigit) % 10;
            previousLastDigit = currentLastDigit;
            currentLastDigit = nextLastDigit;
        }

        return totalSum;
    }
}
