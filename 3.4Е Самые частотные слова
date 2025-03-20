import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
import java.util.PriorityQueue;
import java.util.Comparator;
// без библиотек тоже можно решил узнать как они работают
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        scanner.nextLine();

        Map<String, Integer> wordFrequencies = new TreeMap<>();

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(new FrequencyComparator());

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] words = line.split("[^a-zA-Z]+");

            for (String word : words) {
                String lowerCaseWord = word.toLowerCase();
                wordFrequencies.put(lowerCaseWord, wordFrequencies.getOrDefault(lowerCaseWord, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        while (!pq.isEmpty()) {
            Map.Entry<String, Integer> entry = pq.poll();
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
    static class FrequencyComparator implements Comparator<Map.Entry<String, Integer>> {
        public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
            int freqCompare = Integer.compare(e2.getValue(), e1.getValue());
            if (freqCompare == 0) {
                return e1.getKey().compareTo(e2.getKey());
            }
            return freqCompare;
        }
    }
}
