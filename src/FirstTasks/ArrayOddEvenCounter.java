package FirstTasks;

import java.util.Random;

public class ArrayOddEvenCounter {

    public static void main(String[] args) {

        int countEven = 0;
        int countOdd = 0;

        int[] arr = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99};

        for (int i = 0; i < arr.length; i++ ) {

            if ((arr[i] % 2) == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        System.out.println("Even numbers: " + countEven);
        System.out.println("Odd numbers: " + countOdd);
    }
}
