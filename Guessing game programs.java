import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        int userGuess;
        
        System.out.println("Guess a number between 1 and 100:");

        while (true) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed the correct number.");
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        scanner.close();
    }
}
