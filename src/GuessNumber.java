import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        int inputNumber;

        do {
            System.out.print("Guess a number: ");
            Scanner sc = new Scanner(System.in);
            inputNumber = sc.nextInt();

            if (inputNumber > number) {
                System.out.println("Number is less than input.");
            } else if (inputNumber < number){
                System.out.println("Number is greater than input.");
            }
        } while (inputNumber != number);

        System.out.println("Correct!");

    }
}
