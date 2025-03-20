import java.util.Scanner;

public class CommonLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] letterCounts = new int[26][1000];
        int wordCount = 0;

        while (scanner.hasNextLine()) {
            String word = scanner.nextLine();
            for (char c : word.toCharArray()) {
                letterCounts[c - 'a'][wordCount]++;
            }
            wordCount++;
        }
        scanner.close();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            boolean commonLetter = true;
            for (int j = 0; j < wordCount; j++) {
                if (letterCounts[i][j] == 0) {
                    commonLetter = false;
                    break;
                }
            }
            if (commonLetter) {
                result.append((char) ('a' + i));
            }
        }

        System.out.println(result.toString());
    }
}
