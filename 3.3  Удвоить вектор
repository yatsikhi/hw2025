import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("Выберите операцию:");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("0. Завершить программу");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performAddition(scanner);
                    break;
                case 2:
                    performSubtraction(scanner);
                    break;
                case 3:
                    performMultiplication(scanner);
                    break;
                case 4:
                    performDivision(scanner);
                    break;
                case 0:
                    continueProgram = false;
                    break;
                default:
                    System.out.println("Неправильный выбор. Попробуйте снова.");
                    break;
            }
        }

        System.out.println("Программа завершена!");
        scanner.close(); // Закрываем поток ввода
    }

    private static void performAddition(Scanner scanner) {
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double result = num1 + num2;
        System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, result);
    }

    private static void performSubtraction(Scanner scanner) {
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double result = num1 - num2;
        System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, result);
    }

    private static void performMultiplication(Scanner scanner) {
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double result = num1 * num2;
        System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, result);
    }

    private static void performDivision(Scanner scanner) {
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        if (num2 == 0) {
            System.out.println("Деление на ноль невозможно!");
            return;
        }

        double result = num1 / num2;
        System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, result);
    }
}
