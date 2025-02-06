import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Число элементов в последовательности
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Читаем элементы последовательности
        for (int i = 0; i < n; i++) {
            int currentElement = scanner.nextInt();
            frequencyMap.put(currentElement, frequencyMap.getOrDefault(currentElement, 0) + 1);
        }

        // Проверяем наличие элемента, встречающегося более n/2 раз
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > n / 2) {
                System.out.println(1);
                return;
            }
        }

        // Если такого элемента нет, выводим 0
        System.out.println(0);
    }
}
