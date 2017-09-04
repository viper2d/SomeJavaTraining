package FirstTasks;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = new int[] {3,1,7,2,5,6};
        int tmpVar = 0;

        System.out.println("Array: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    tmpVar = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmpVar;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
