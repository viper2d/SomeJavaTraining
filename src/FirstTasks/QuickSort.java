package FirstTasks;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] array = new int[] {3,1,7,2,5,4,9};

        int i = array[0];
        int j = array.length - 1;
        int midVal = array[array.length / 2];
        int tmpVar;

        while (i <= j){
            while (array[i] < midVal) {
                i++;
            }
            while (array[j] > midVal) {
                j--;
            }
            if (i <= j) {
                tmpVar = array[j];
                array[i] = array[j];
                array[j] = tmpVar;
                i++;
                j--;
            }
        }

        System.out.println(Arrays.toString(array));

    }

}
