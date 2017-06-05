
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        int sumOfNumbers = 0;
       for (int numbers : list){
           
         sumOfNumbers += numbers;
                 //list.(Integer.valueOf(numbers));
       }
        return sumOfNumbers;
    }
    
    

    public static double average(ArrayList<Integer> list) {
        // write code here
        int counter = 0;
        //double averageOfNumbers = 0;
        
        for (int number: list){
            
            counter++;
            
        }
            
        return  1.0 *  sum(list)/counter;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}