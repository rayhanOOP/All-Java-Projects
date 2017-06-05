
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int number = Integer.parseInt(reader.nextLine());
        
        NumberStatistics statistics = new NumberStatistics();
        NumberStatistics statsOfEvenNumbers = new NumberStatistics();
        NumberStatistics statsOfOddNumbers = new NumberStatistics();

        while (true) {
            if (number == -1) {
                System.out.println("sum: " + statistics.sum());
                System.out.println("sum of even: " + statsOfEvenNumbers.sum());
                System.out.println("sum of odd: " + statsOfOddNumbers.sum());
                break;
            } 
            
            else if (number % 2 == 0){
                
                statistics.addNumber(number);
                statsOfEvenNumbers.addNumber(number);
                number = Integer.parseInt(reader.nextLine());
            }
            
            else {
                
                statistics.addNumber(number);
                statsOfOddNumbers.addNumber(number);
                number = Integer.parseInt(reader.nextLine());
            }
        }
//        NumberStatistics statistics = new NumberStatistics();
//        NumberStatistics statistics1 = new NumberStatistics();
//        NumberStatistics statistics2 = new NumberStatistics();
//        
//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
//        System.out.println("Amount: " + statistics.amountOfNumbers());
//        System.out.println(statistics.sum());
//        System.out.println(statistics.average());

        // Remember to remove all the extra code when doing assignments  79.3 and 79.4
        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.
        // The tests does not work if you do not create the objects in the correct order
    }
}
