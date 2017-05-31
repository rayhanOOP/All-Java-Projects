
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        int sum = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        //Scanner reader2 = new Scanner(System.in);
        System.out.println("Type another number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        
        sum = firstNumber + secondNumber ;
        
        System.out.println("Sum of the numbers: " + sum);

        // Implement your program here. Remember to ask the input from user
    }
}
