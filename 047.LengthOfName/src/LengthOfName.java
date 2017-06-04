
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
       System.out.println("please enter the name you want to check : ");
        String inputText = reader.nextLine();
        
        System.out.println("The length of the name is : " + calculateCharacters(inputText));
    }
    
    // do here the method
    public static int calculateCharacters(String text){
        int numberOfCharacters = 0;
        numberOfCharacters = text.length();
        return numberOfCharacters;
    }
    
}
