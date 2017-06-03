
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Up to what number? ");
        int inputNumber = Integer.parseInt(reader.nextLine());
        int numberToPrint= 1;
        while (numberToPrint <= inputNumber){
            System.out.println(numberToPrint);
            numberToPrint++;
        }
       
        
    }
}
