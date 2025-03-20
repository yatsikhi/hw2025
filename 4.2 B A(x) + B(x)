import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int n = scanner.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            a[i] = scanner.nextInt();
        }

       
        int m = scanner.nextInt();
        int[] b = new int[m + 1];
        for (int i = 0; i <= m; i++) {
            b[i] = scanner.nextInt();
        }

        
        int k = Math.max(n, m);
        int[] result = new int[k + 1];

        
        for (int i = 0; i <= k; i++) {
            if (i <= n) {
                result[i] += a[i];
            }
            if (i <= m) {
                result[i] += b[i];
            }
        }

        
        while (k > 0 && result[k] == 0) {
            k--;
        }

        
        System.out.println(k);
        for (int i = k; i >= 0; i--) {
            System.out.print(result[i] + " ");
        }

        scanner.close();
    }
}
