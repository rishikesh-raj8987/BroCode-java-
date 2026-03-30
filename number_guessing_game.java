import java.util.Random;
import java.util.Scanner;

public class number_guessing_game {
    public static void main(String[] args){

        //NUMBER GUSSEING GAME

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts= 0;
        int randomNumber =random.nextInt(1 , 11);

        System.out.println("Number guessing game");
        System.out.println("Guess a number between 1-10:");

        do {
            System.out.println("Enter the guess: ");
            guess = scanner.nextInt();
            attempts++;
        }while (guess != randomNumber);
        System.out.println("You have won");

    }
}
