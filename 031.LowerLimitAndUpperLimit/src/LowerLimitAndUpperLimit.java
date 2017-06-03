
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
            System.out.println("First Number: ");
            int firstNumber = Integer.parseInt(reader.nextLine());
            System.out.println("Last Number: ");
            int lastNumber = Integer.parseInt(reader.nextLine());
            
            while (!(firstNumber > lastNumber)){
            
                System.out.println(firstNumber);
                firstNumber++;
            }
            

        // write your code here

    }
}
