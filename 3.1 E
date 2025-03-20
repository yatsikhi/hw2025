import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TextEditorTest {
    public static void main(String[] args) {
        StringBuilder fileContent = new StringBuilder();
        String line;
        boolean isFileLoaded = false;

        try {
            while ((line = readLine()) != null && !line.isEmpty()) {
                if (!isFileLoaded) {
                    fileContent.append(line).append("\n");
                } else {
                    processCommand(fileContent, line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(fileContent.toString());
    }

    private static void processCommand(StringBuilder fileContent, String command) {
        switch (command) {
            case "Down":
                moveCursorDown(fileContent);
                break;
            case "Up":
                moveCursorUp(fileContent);
                break;
            case "Shift":
                shiftPressed = true;
                break;
            case "Ctrl+X":
                cutSelectedLines(fileContent);
                break;
            case "Ctrl+V":
                pasteFromClipboard(fileContent);
                break;
        }
    }

    private static void moveCursorDown(StringBuilder fileContent) {
        int cursorPosition = fileContent.lastIndexOf("\n") + 1;
        if (cursorPosition == fileContent.length() - 1) return;
        if (shiftPressed) {
            selectLine(fileContent, cursorPosition);
        } else {
            fileContent.insert(cursorPosition, "\u001B[D"); // Move cursor down
        }
    }

    private static void moveCursorUp(StringBuilder fileContent) {
        int cursorPosition = fileContent.indexOf("\u001B[D");
        if (cursorPosition == -1 || cursorPosition == 0) return;
        if (shiftPressed) {
            deselectLine(fileContent, cursorPosition);
        } else {
            fileContent.deleteCharAt(cursorPosition - 1); // Move cursor up
        }
    }

    private static void cutSelectedLines(StringBuilder fileContent) {
        if (selectedLines.isEmpty()) {
            int cursorPosition = fileContent.lastIndexOf("\n") + 1;
            int nextNewline = fileContent.indexOf("\n", cursorPosition);
            if (nextNewline == -1) return;
            clipboard = fileContent.substring(cursorPosition, nextNewline);
            fileContent.replace(cursorPosition, nextNewline, "");
        } else {
            Deque<String> linesToCut = new ArrayDeque<>(selectedLines);
            selectedLines.clear();
            clipboard = String.join("\n", linesToCut);
            removeSelectedLines(fileContent);
        }
        shiftPressed = false;
    }

    private static void pasteFromClipboard(StringBuilder fileContent) {
        if (clipboard == null || clipboard.isEmpty()) return;
        int cursorPosition = fileContent.lastIndexOf("\n") + 1;
        fileContent.insert(cursorPosition, clipboard + "\n");
        shiftPressed = false;
    }

    private static void selectLine(StringBuilder fileContent, int cursorPosition) {
        int startOfLine = findStartOfLine(fileContent, cursorPosition);
        int endOfLine = findEndOfLine(fileContent, cursorPosition);
        String line = fileContent.substring(startOfLine, endOfLine);
        selectedLines.offer(line);
    }

    private static void deselectLine(StringBuilder fileContent, int cursorPosition) {
        int startOfLine = findStartOfLine(fileContent, cursorPosition);
        int endOfLine = findEndOfLine(fileContent, cursorPosition);
        String line = fileContent.substring(startOfLine, endOfLine);
        selectedLines.remove(line);
    }

    private static void removeSelectedLines(StringBuilder fileContent) {
        for (String line : selectedLines) {
            int index = fileContent.indexOf(line);
            if (index >= 0) {
                fileContent.delete(index, index + line.length());
            }
        }
    }

    private static int findStartOfLine(StringBuilder fileContent, int position) {
        int startOfLine = position;
        while (startOfLine > 0 && fileContent.charAt(startOfLine - 1) != '\n') {
            startOfLine--;
        }
        return startOfLine;
    }

    private static int findEndOfLine(StringBuilder fileContent, int position) {
        int endOfLine = position;
        while (endOfLine < fileContent.length() && fileContent.charAt(endOfLine) != '\n') {
            endOfLine++;
        }
        return endOfLine;
    }

    private static String readLine() throws IOException {
        byte[] buffer = new byte[1024]; // Размер буфера
        int length = System.in.read(buffer);
        if (length <= 0) return null;
        return new String(buffer, 0, length, StandardCharsets.UTF_8).trim();
    }

    private static String clipboard;
    private static boolean shiftPressed = false;
    private static Deque<String> selectedLines = new ArrayDeque<>();
}
