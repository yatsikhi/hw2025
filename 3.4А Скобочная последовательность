import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (isValid(input)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isValid(String sequence) {
        char[] stack = new char[sequence.length()];
        int top = -1;

        for (char c : sequence.toCharArray()) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack[++top] = c;
                    break;
                case ')':
                    if (top < 0 || stack[top--] != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (top < 0 || stack[top--] != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (top < 0 || stack[top--] != '{') {
                        return false;
                    }
                    break;
            }
        }

        return top == -1;
    }
}
