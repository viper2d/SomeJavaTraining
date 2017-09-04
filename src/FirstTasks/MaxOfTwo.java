package FirstTasks;

import java.util.Scanner;

public class MaxOfTwo {

    public static void main(String[] args) {

        int max = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num:");
        int firstNum = sc.nextInt();
        System.out.println("Enter second num:");
        int secondNum = sc.nextInt();

        if (firstNum > secondNum){
            max = firstNum;
        } else {
            max = secondNum;
        }

        System.out.println("Maximum of two numbers: " + max);

    }
}
