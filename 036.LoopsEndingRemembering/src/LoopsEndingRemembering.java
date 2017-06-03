import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int amountOfNumbers = 0;
        int oddNumberCounter = 0;
        int evenNumberCounter = 0;
        
        while (true){
        System.out.print("Type numbers: ");
        int number = Integer.parseInt(reader.nextLine());
        
        if (!(number == (-1))){
            amountOfNumbers++;
             sum += number;
             if (number % 2 == 0){
                 evenNumberCounter++;
             }
             else oddNumberCounter++;
        }
        else  
        {
             double average = 1.0 * sum / amountOfNumbers ;
             System.out.println("Thank you and see you later!");
             System.out.println("The sum is " + sum);  
             System.out.println("How many numbers: " + amountOfNumbers );
             System.out.println("Average: " + average );
             System.out.println("Even numbers: " + evenNumberCounter);
             System.out.println("Odd numbers: " + oddNumberCounter);
             break;
            }
        }   
    }
}
