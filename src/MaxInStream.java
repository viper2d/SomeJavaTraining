import java.util.*;

public class MaxInStream {

    public static void main(String[] args) {

        int maxNum = 0;
        int checkInput;

        do {
            System.out.print("Enter number: ");
            Scanner sc = new Scanner(System.in);
            int inputNumber = sc.nextInt();
            checkInput = inputNumber;

            if (inputNumber > maxNum) {
                maxNum = inputNumber;
            }

        } while (checkInput!=0);

        System.out.println("Greatest number: " + maxNum);

    }
}