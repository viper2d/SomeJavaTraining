package FirstTasks;

import java.util.Arrays;

public class SwitchFirstAndHighestInArray {

    public static void main(String[] args) {

        int[] arr = new int[] {0,5,6,7,1};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Highest number: " + getHighest(arr));
        System.out.println("Switched array: " + Arrays.toString(newArray(arr, getHighest(arr))));
    }

     public static int getHighest(int[] array) {

         int highest = array[0];

         for (int i = 0; i < array.length; i++) {
             if (array[i] > highest) {
                 highest = array[i];
             }
         }
         return highest;
    }

    public static int[] newArray(int[] array, int highest) {

        int tempVar;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == highest) {
                tempVar = array[0];
                array[0] = array[i];
                array[i] = tempVar;
            }
        }
        return array;
    }
}