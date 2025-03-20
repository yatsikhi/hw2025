import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);
        int N = gg.nextInt();

        // фамилий студентов
        String[] students = new String[N];
        int start = 0;
        int end = N - 1;




        for (int i = 0; i < N; i++) {
            String name = gg.next(); // Фамилия студента
            String position = gg.next();

            if ("top".equals(position)) {
                students[start++] = name;
            } else {
                students[end--] = name;
            }
        }

        int M = gg.nextInt();

        for (int i = 0; i < M; i++) {
            int x = gg.nextInt();


            System.out.println(students[x - 1]);
        }
    }
}
