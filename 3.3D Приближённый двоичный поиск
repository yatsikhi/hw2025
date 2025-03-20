import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        int k = scanner.nextInt();

        List<Integer> firstArray = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            firstArray.add(scanner.nextInt());
        }

        List<Integer> secondArray = new ArrayList<>();
        for (int i = 0; i < k; ++i) {
            secondArray.add(scanner.nextInt());
        }


        for (Integer num : secondArray) {
            int index = Collections.binarySearch(firstArray, num);

            if (index >= 0) { //  найден точно
                System.out.println(num);
            } else {
                index = -(index + 1);

                if (index == 0) {
                    System.out.println(firstArray.get(index));
                } else if (index == firstArray.size()) {
                    System.out.println(firstArray.get(index - 1));
                } else {
                    int leftValue = firstArray.get(index - 1);
                    int rightValue = firstArray.get(index);

                    if (num - leftValue <= rightValue - num) {
                        System.out.println(leftValue);
                    } else {
                        System.out.println(rightValue);
                    }
                }
            }
        }
    }
}
