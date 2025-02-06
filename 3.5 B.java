import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Количество последовательностей
        List<Integer> mergedList = new ArrayList<>();

        // Чтение последовательностей
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt(); // Размер текущей последовательности
            for (int j = 0; j < m; j++) {
                mergedList.add(scanner.nextInt());
            }
        }

        // Сортировка объединенной последовательности
        mergedList.sort(null);

        // Вывод результата
        for (Integer value : mergedList) {
            System.out.print(value + " ");
        }
    }
}
