
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
            System.out.println("Please enter the name: ");
                String name = reader.nextLine();
                int i=0; //counter
                while ( i<(name.length())){
                    System.out.println(i+1 + ". " + "character: " + name.charAt(i));
                        i++;
        }
                
                
    }
    
   
}
