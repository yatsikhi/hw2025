import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        long[] points = new long[n];
        for (int i = 0; i < n; ++i) {
            points[i] = scanner.nextLong();
        }

        Arrays.sort(points); 

        
        long left = 0;
        long right = points[n-1] - points[0]; 

        while (left < right) {
            long mid = left + (right - left) / 2;

            if (canCoverPoints(points, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(left);
    }

    private static boolean canCoverPoints(long[] points, int k, long length) {
        int count = 1; 
        long start = points[0];

        for (int i = 1; i < points.length && count <= k; ++i) {
            if (points[i] - start >= length) {
                start = points[i];
                count++;
            }
        }

        return count <= k;
    }
}
