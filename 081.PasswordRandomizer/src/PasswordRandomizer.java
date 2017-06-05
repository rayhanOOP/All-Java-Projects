
import java.util.Random;

public class PasswordRandomizer {

    private Random randomizer = new Random();// Define the variables
    private int length ;
    public PasswordRandomizer(int length) {
        this.randomizer = new Random(length); // Initialize the variable
        this.length= length;
    }

    public String createPassword() {
        
        int i = 0;
        String password = "";
        //char alphabets = 0  ;
        String allAlphabets = "abcdefghijklmnopqrstuvwxyz";
        while (i < this.length) {
            
            char singleAlphabet = allAlphabets.charAt(this.randomizer.nextInt(allAlphabets.length()));
            
            password+= singleAlphabet;
            
            i++;
        }
        return password;
    }
}
