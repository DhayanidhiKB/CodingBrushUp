package Arrays;

import java.util.Arrays;

public class MoveZerosToStart {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 0, 5, 0, 4, 0, 8};

        System.out.println("Input Array: " + Arrays.toString(inputArray));

        moveZerosToStart(inputArray);

        System.out.println("Output Array: " + Arrays.toString(inputArray));
    }

    public static void moveZerosToStart(int[] arr) {
        int n = arr.length;
        int nonZeroIndex = n - 1;

        // Traverse the array in reverse and move non-zero elements to the end
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                // Swap non-zero element with the last zero or itself
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;

                nonZeroIndex--;
            }
        }
    }
}
