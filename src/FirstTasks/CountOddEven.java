package FirstTasks;

import java.util.Scanner;

public class CountOddEven {

    public static void main(String[] args) {

        int inputNumber;
        int countOdd = 0;
        int countEven = 0;

        do {
            System.out.print("Enter number: ");
            Scanner sc = new Scanner(System.in);
            inputNumber = sc.nextInt();

            if ((inputNumber % 2) == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        } while (inputNumber != 0);

        System.out.println("Even numbers: " + countEven);
        System.out.println("Odd numbers: " + countOdd);

    }
}
