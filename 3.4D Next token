import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char delimiter = scanner.next().charAt(0);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == delimiter) {
                if (sb.length() > 0) {
                    System.out.println(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(currentChar);
            }
        }


        if (sb.length() > 0) {
            System.out.println(sb.toString());
        }
    }
}
