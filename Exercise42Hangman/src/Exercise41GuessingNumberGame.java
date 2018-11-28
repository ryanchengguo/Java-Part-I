import java.util.Random;
import java.util.Scanner;
 
public class Exercise41GuessingNumberGame {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
 
        // program your solution here. Do not touch the above lines!
        
        int guessesMAde = 0;
        while (true) {
            System.out.print("Guess a number: ");
            int guess = Integer.parseInt(reader.nextLine());
            guessesMAde++;
 
            if (guess == numberDrawn) {
                break;
            } else if (guess < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + guessesMAde);
            } else {
                System.out.println("The number is lesser, guesses made: " + guessesMAde);
            }
        }
 
        System.out.println("Congratulations, your guess is correct!");
    }
 
    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
