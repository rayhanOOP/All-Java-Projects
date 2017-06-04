import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter the name: ");
        String name = reader.nextLine();
        System.out.println("In reverse order: ");
        int i = 0;
        while (i<name.length()){
            System.out.print(name.charAt(name.length()-(i+1)));
            i++;
        }
    }
}
