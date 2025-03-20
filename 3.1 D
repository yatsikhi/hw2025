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
        } catch (Exception e) {
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
            case "Ctrl+X":
                cutCurrentLine(fileContent);
                break;
            case "Ctrl+V":
                pasteFromClipboard(fileContent);
                break;
        }
    }

    private static void moveCursorDown(StringBuilder fileContent) {
        int cursorPosition = fileContent.lastIndexOf("\n") + 1;
        if (cursorPosition == fileContent.length() - 1) return;
        fileContent.insert(cursorPosition, "\u001B[D"); // Move cursor down
    }

    private static void moveCursorUp(StringBuilder fileContent) {
        int cursorPosition = fileContent.indexOf("\u001B[D");
        if (cursorPosition == -1 || cursorPosition == 0) return;
        fileContent.deleteCharAt(cursorPosition - 1); // Move cursor up
    }

    private static void cutCurrentLine(StringBuilder fileContent) {
        int cursorPosition = fileContent.lastIndexOf("\n") + 1;
        int nextNewline = fileContent.indexOf("\n", cursorPosition);
        if (nextNewline == -1) return;
        clipboard = fileContent.substring(cursorPosition, nextNewline);
        fileContent.replace(cursorPosition, nextNewline, "");
    }

    private static void pasteFromClipboard(StringBuilder fileContent) {
        if (clipboard == null || clipboard.isEmpty()) return;
        int cursorPosition = fileContent.lastIndexOf("\n") + 1;
        fileContent.insert(cursorPosition, clipboard + "\n");
    }

    private static String readLine() throws Exception {
        byte[] buffer = new byte[1024]; // Размер буфера
        int length = System.in.read(buffer);
        if (length <= 0) return null;
        return new String(buffer, 0, length).trim();
    }

    private static String clipboard;
}
