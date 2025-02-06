import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); 
        int[] array = new int[n];
        
       
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        int q = scanner.nextInt(); 
        
        
        int position = Arrays.binarySearch(array, q);
        
        
        if (position >= 0) {
            System.out.println(position);
        } else {
            System.out.println(-1);
        }
    }
}
