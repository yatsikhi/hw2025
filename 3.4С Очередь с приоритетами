import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxSize = 200_001; // для удобства судить не надо))))
        int[] heap = new int[maxSize];
        int size = 0;

        while (scanner.hasNextLine()) {
            String command = scanner.nextLine().trim();

            if ("CLEAR".equals(command)) {
                clear(heap, size);
                size = 0;
            } else if (command.startsWith("ADD")) {
                add(heap, size++, Integer.parseInt(command.substring(4)));
            } else if ("EXTRACT".equals(command)) {
                extract(heap, size);
            }
        }
    }

    private static void clear(int[] heap, int size) {
        for (int i = 0; i < size; i++) {
            heap[i] = 0;
        }
    }

    private static void add(int[] heap, int index, int value) {
        heap[index] = value;
        siftUp(heap, index);
    }

    private static void extract(int[] heap, int size) {
        if (size == 0) {
            System.out.println("CANNOT");
        } else {
            System.out.println(heap[0]);
            heap[0] = heap[size - 1];
            size--;
            siftDown(heap, 0, size);
        }
    }

    private static void siftUp(int[] heap, int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap[index] <= heap[parentIndex]) {
                break;
            }
            swap(heap, index, parentIndex);
            index = parentIndex;
        }
    }

    private static void siftDown(int[] heap, int index, int size) {
        while (2 * index + 1 < size) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            int largest = leftChild;

            if (rightChild < size && heap[rightChild] > heap[leftChild]) {
                largest = rightChild;
            }

            if (heap[index] >= heap[largest]) {
                break;
            }

            swap(heap, index, largest);
            index = largest;
        }
    }

    private static void swap(int[] heap, int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }
}
