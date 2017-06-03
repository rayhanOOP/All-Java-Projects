
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the password: ");
        String inputPassword = reader.nextLine();
        String password = "carrot"; // Use carrot as password when running tests.
        
    while (true){
            if(inputPassword.equals(password)){
            System.out.println("Right!");
            System.out.println("The secret is: jryy qbrr!");
            break;
            }
            else {
                System.out.println("Wrong!");
                System.out.println("Type the password: ");
                inputPassword = reader.nextLine();
                
            }
                    
        }
    }
}
