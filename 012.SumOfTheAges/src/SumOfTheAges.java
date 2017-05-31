
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        int totalAge = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String firstPersonName = reader.nextLine();
        System.out.println("Type your age: ");
        int firstPersonAge = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type your name: ");
        String secondPersonName = reader.nextLine();
        System.out.println("Type your age: ");
        int secondPersonAge = Integer.parseInt(reader.nextLine());        
        
        totalAge = firstPersonAge + secondPersonAge ;
        
        System.out.println(firstPersonName + " and " + secondPersonName + " are " + totalAge + " years old in total.");

        // Implement your program here
    }
}
