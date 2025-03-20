import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считаем длину строк
        int n = scanner.nextInt();
        scanner.nextLine(); // Переход на следующую строку после считывания числа

        // Считаем первую строку
        String A = scanner.nextLine();

        // Считаем вторую строку
        String B = scanner.nextLine();

        // Создадим пустую строку для результата
        StringBuilder result = new StringBuilder();

        // Проходим по каждой позиции в строках и добавляем символы чередуя
        for (int i = 0; i < n; i++) {
            result.append(A.charAt(i));
            result.append(B.charAt(i));
        }

        // Выводим результат
        System.out.println(result.toString());

        scanner.close();
    }
}
