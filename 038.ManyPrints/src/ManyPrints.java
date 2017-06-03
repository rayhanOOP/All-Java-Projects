
import java.util.Scanner;

public class ManyPrints {
    // NOTE: do not change the method definition, e.g. add parameters to method
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");// Write your code here
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many? ");// ask the user how many times the text should be printed
        
        // use the while structure to call the printText method several times
        int numberOfAppearence = Integer.parseInt(reader.nextLine());
        int counter =1;
        while (true){
            if (counter <= numberOfAppearence){
                printText();
                counter++;
            }
            else break;
        }
    }
}