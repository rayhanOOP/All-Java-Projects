
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what? ");
        int upperLimitNumber = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int numberToAdd = 1;
        while (numberToAdd <= upperLimitNumber){
            sum += numberToAdd ;
            
            numberToAdd++;
        }
        System.out.println("Sum is " + sum);

    }
}
