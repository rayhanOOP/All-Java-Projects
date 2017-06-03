
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int counter = 0;
        System.out.println("Guess a number: ");
        int guessNumber = Integer.parseInt(reader.nextLine());
        
        int numberDrawn = drawNumber();
        
        while (true){
            if (guessNumber < numberDrawn){
                counter++;
                System.out.println("The number is greater, guesses made: " + counter);
                guessNumber = Integer.parseInt(reader.nextLine());
                System.out.println("Guess a number: ");
            }
            else if (guessNumber > numberDrawn){
                counter++;
                System.out.println("The number is lesser, guesses made: " + counter);
                guessNumber = Integer.parseInt(reader.nextLine());
                System.out.println("Guess a number: ");
        }
            else { 
               System.out.println("Congratulations, your guess is correct!");
                break;
                
            }
        
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
