
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        System.out.println("please enter your first number: ");
        int firstNumber = Integer.parseInt(reader.nextLine()); // store numbers read form user in this variable
        System.out.println("Enter the second one: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the third one: ");
        int thirdNumber = Integer.parseInt(reader.nextLine());
        
        sum += firstNumber + secondNumber + thirdNumber ;
        // Write your program here
        // Use only variables sum and read

        System.out.println("Sum: " + sum);
    }
}
