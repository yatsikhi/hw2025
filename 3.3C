import java.util.Iterator;
import java.util.List;

public class Main {

    public static <T extends Comparable<T>> List<T> Main(Iterator<T> iter1, Iterator<T> iter2, List<T> result) {
        T current1 = null;
        T current2 = null;

        while (iter1.hasNext() && iter2.hasNext()) {
            if (current1 == null) {
                current1 = iter1.next();
            }

            if (current2 == null) {
                current2 = iter2.next();
            }

            int comparison = current1.compareTo(current2);
            if (comparison < 0) {
                result.add(current1);
                current1 = null; // Переходим к следующему элементу первого итератора
            } else if (comparison > 0) {
                current2 = null; // Переходим к следующему элементу второго итератора
            } else { // current1.equals(current2)
                current1 = null;
                current2 = null;
            }
        }

        // Добавляем оставшиеся элементы из первого итератора
        while (iter1.hasNext()) {
            result.add(iter1.next());
        }

        return result;
    }
}
