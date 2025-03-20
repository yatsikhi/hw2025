import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int[] queue = new int[k]; 
        int head = 0, tail = 0;

        for (int i = 0; i < n; i++) {
        
            while (head < tail && queue[head] < i - k + 1) {
                head++;
            }

        
            while (head < tail && array[queue[tail - 1]] > array[i]) {
                tail--;
            }

            if (tail < k) {
                queue[tail++] = i; 
            }

       
            if (i >= k - 1) {
                System.out.println(array[queue[head]]);
            }
        }
    }
}
