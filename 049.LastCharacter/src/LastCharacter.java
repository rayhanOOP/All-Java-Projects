import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter your text to find the last character : ");
        String name = reader.nextLine();
        System.out.println("The last character of this string is : "+ lastCharacter(name) );
    }
    
    public static char lastCharacter(String testName){
        char lastCharacterInString = testName.charAt(testName.length()-1);
        return lastCharacterInString;
    }
            
}
