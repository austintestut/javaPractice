import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuess {
    public static void main(String[] args) {

        int number;
        String guessStr;
        int guess;

        Random randomNumber = new Random();

        number = randomNumber.nextInt(51);

        Scanner userAnswer = new Scanner(System.in);

        do {
            System.out.println("Guess the number!");
            guessStr = userAnswer.nextLine();
            guess = Integer.parseInt(guessStr);
            if (guess == number) {
                System.out.println("Correct!");
            } else if (guess < number) {
                System.out.println("That guess is lower than the number...");
            } else {
                System.out.println("That guess is higher than the number...");
            }
        } while (guess != number);
    }
}
