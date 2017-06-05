import java.util.Scanner;

public class Palindromi {

    public static String reverse(String text) {
   
        String reverseText="";
        
        int j = text.length();
        int i = 0;
        while (i < text.length()){
            
            reverseText += text.charAt(text.length()-(i+1));
            
            i++;
        }
        
        return reverseText;
        
    }
    public static boolean palindrome(String text) {
        
        // write code here
        boolean palindome_Yes = true;
        if (reverse(text).equals(text)){
        
            return palindome_Yes;
        
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
