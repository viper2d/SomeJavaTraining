import java.util.Scanner;

public class NumberGuesser {

    public static void main(String[] args) {

        int input;
        int guess = 0;
        int rangeLowest = 1;
        int rangeHighest = 100;
        String compare;

        System.out.println("Input number in range 1 - 100: ");
        Scanner scinput = new Scanner(System.in);
        input = scinput.nextInt();

        while (guess != input){
            System.out.println(rangeLowest + " " + rangeHighest);
            guess = (rangeHighest - rangeLowest)/2 + rangeLowest;
            System.out.println("Is your number '>' '<' or '=' " + guess + "?");
            Scanner sccompare = new Scanner(System.in);
            compare = sccompare.nextLine();
            System.out.println(compare);

            if (compare.equals(">")) {
                rangeLowest = guess;
            } else if (compare.equals("<")) {
                rangeHighest = guess;
            } else if (compare.equals("=")) {
                System.out.println("Tadaaa!");
            }
        }

    }
}