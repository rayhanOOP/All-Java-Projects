import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int factorial = 1;
        int helpingNumber = 1;
        while (helpingNumber <= number){
            factorial *= helpingNumber;
            helpingNumber++;
        }
        System.out.println("Factorial is " + factorial);
    }
}
