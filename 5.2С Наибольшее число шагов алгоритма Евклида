import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;

        while (true) {
            int next = a + b;
            if (next > n) {
                break;
            }
            a = b;
            b = next;
        }

        System.out.println(a + " " + b);
    }
}
