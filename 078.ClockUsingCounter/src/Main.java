
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        Scanner reader = new Scanner(System.in);
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton shown
        // in the assignment
        BoundedCounter hoursCounter = new BoundedCounter(23);
        BoundedCounter minutesCounter = new BoundedCounter(59);
        BoundedCounter secondsCounter = new BoundedCounter(59);
        
        System.out.print("seconds: ");
        int s = Integer.parseInt(reader.nextLine());// read the initial value of seconds from the user
        System.out.print("minutes: ");
        int m = Integer.parseInt(reader.nextLine());// read the initial value of minutes from the user
        System.out.print("hours: ");
        int h = Integer.parseInt(reader.nextLine());// read the initial value of hours from the user
        
        
        secondsCounter.setValue(s);
        minutesCounter.setValue(m);
        hoursCounter.setValue(h);
        
        int i = 0;
        while (true) {
            System.out.println(hoursCounter + ":" + minutesCounter + ":" + secondsCounter);
            Thread.sleep(1000);
            
            secondsCounter.next();

            if (secondsCounter.getValue() == 0) {
                minutesCounter.next();

                if (minutesCounter.getValue() == 0) {
                    hoursCounter.next();
                    
                }
              
            }
            
            i++;// increamental counter
        }

    }
}
