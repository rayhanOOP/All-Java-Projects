
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
            System.out.println("First: ");
            int lowerLimit = Integer.parseInt(reader.nextLine());
            System.out.println("Second: ");
            int upperLimit = Integer.parseInt(reader.nextLine());
            int sum = 0;
            while(lowerLimit <= upperLimit){
                sum+= lowerLimit;
                lowerLimit++;
            }
            System.out.println(sum);
    }       
}
