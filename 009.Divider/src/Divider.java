
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        double division = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        //Scanner reader2 = new Scanner(System.in);
        System.out.println("Type another number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        
        division = 1.0 * firstNumber / secondNumber ;
        
        System.out.println("Division: " + firstNumber + " / " + secondNumber + " = " + division);
        // Implement your program here. Remember to ask the input from user.
    }
}
