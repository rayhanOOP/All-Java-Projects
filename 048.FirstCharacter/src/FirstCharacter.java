import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter your string first : ");
        String testString = reader.nextLine();
        System.out.println("The first character of this string is : " + firstCharacter(testString));
    }
    
    public static char firstCharacter(String text){
        char firstCharacterOfTheString  = text.charAt(0);
        return firstCharacterOfTheString;
    }
}
