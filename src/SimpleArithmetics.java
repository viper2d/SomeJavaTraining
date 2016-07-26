import java.util.Scanner;

public class SimpleArithmetics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num:");
        int firstNum = sc.nextInt();
        System.out.println("Enter second num:");
        int secondNum = sc.nextInt();
        System.out.println("Addition result: " + (firstNum + secondNum));
        System.out.println("Substraction result: " + (firstNum - secondNum));
        System.out.println("Multiplication result: " + (firstNum * secondNum));
        System.out.println("Division result: " + ((double)firstNum / secondNum));

    }
}
