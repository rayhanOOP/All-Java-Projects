
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        double circumferenceOfTheCircle = 2 * Math.PI * radius ;
        
        System.out.println("Circumference of the circle: " + circumferenceOfTheCircle);
        
        // Program your solution here 
    }
}
