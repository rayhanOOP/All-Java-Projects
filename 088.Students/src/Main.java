
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Name: ");
            String name = input.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Student number: ");
            String studentNumber = input.nextLine();

            students.add(new Student(name, studentNumber));

        }
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.print("Given search term: ");
        String search = input.nextLine();
        System.out.println("Result: ");
        for (Student s : students) {
            if (s.getName().contains(search)) {
                System.out.println(s);
            }
        }

    }

}
