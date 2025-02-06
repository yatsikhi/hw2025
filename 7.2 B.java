import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 
        int[] sequence = new int[n];

        
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int element : sequence) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > n / 4) {
                count++;
            }
            if (count == 3) {
                break;
            }
        }

        
        if (count >= 3) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
