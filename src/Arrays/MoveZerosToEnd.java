package Arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 0, 5, 0, 4, 0, 8};

        System.out.println("Input Array: " + Arrays.toString(inputArray));

        moveZerosToEnd(inputArray);

        System.out.println("Output Array: " + Arrays.toString(inputArray));
    }

    public static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int nonZeroIndex = 0;

        // Traverse the array and move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // Swap non-zero element with the first zero or itself
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;

                nonZeroIndex++;
            }
        }
    }
}

