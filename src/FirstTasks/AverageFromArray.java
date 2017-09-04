package FirstTasks;

import java.util.Random;

public class AverageFromArray {

    public static void main(String[] args) {

        int[] arr = initArray(100);
        calculateAverage(arr);
        printAverageToConsole(calculateAverage(arr));
    }

    public static int[] initArray (int arrLength) {
        int[] arr = new int[arrLength];
        int i;
        for (i = 0; i < arr.length; i++) {
            Random rnd = new Random();
            arr[i] = rnd.nextInt(100);
        }
        return arr;
    }

    public static int calculateAverage(int[] arr) {
        int i;
        int sum = 0;
        int average;
        for (i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        average = sum / arr.length;
        return average;
    }

    public static void printAverageToConsole(int average) {
        System.out.println("Average is: " + average);
    }
}
