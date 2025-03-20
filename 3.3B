import java.util.Arrays;

class Main {
    public static <T> int unique(T[] array) {
        if (array.length == 0) return 0;

        int writeIndex = 1;
        for (int readIndex = 1; readIndex < array.length; readIndex++) {
            if (!array[readIndex].equals(array[writeIndex - 1])) {
                array[writeIndex++] = array[readIndex];
            }
        }

        return writeIndex;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 2, 3, 4, 5, 6, 7, 8, 9};

        int newLength = unique(arr);

        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, newLength)));
    }
}
