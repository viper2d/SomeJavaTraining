package FirstTasks;

import java.util.Scanner;

public class MaxOfThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num:");
        int firstNum = sc.nextInt();
        System.out.println("Enter second num:");
        int secondNum = sc.nextInt();
        System.out.println("Enter third num:");
        int thirdNum = sc.nextInt();

        if (firstNum >= secondNum && firstNum >= thirdNum){
            System.out.println(firstNum);
        } else if (secondNum >= firstNum && secondNum >= thirdNum){
            System.out.println(secondNum);
        } else {
            System.out.println(thirdNum);
        }

    }
}
