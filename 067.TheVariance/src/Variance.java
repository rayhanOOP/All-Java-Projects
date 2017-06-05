import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        
         int sum = 0;
        
         for (int l : list){
            sum += l;
        }
        return sum;
    }
    

    public static double average(ArrayList<Integer> list) {
  
            
        return  1.0 *  sum(list)/list.size();
    }

    public static double variance(ArrayList<Integer> list) {

       double varianceOfNumbers = 0;
        double cal = 0;
        
        for (int numbers : list){
            
            cal +=  Math.pow((numbers - average(list)),2.0 );
            
            varianceOfNumbers = cal/(double)(list.size()-1);
        }
        
        
        
        return varianceOfNumbers;
    }
    
            //----------------------------------------//
    
//        int sumOfNumbers = 0;
//       for (int numbers : list){
//           
//         sumOfNumbers += numbers;
//                 //list.(Integer.valueOf(numbers));
//       }
//        return sumOfNumbers;
//    }
//    
//    // Copy here average from exercise 64 
//    public static double average(ArrayList<Integer> list) {
//        int counter =0;
//        double averageOfNumbers = 0;
//        
//        for (int numbers : list){
//            
//            counter++;
//        }
//        
//        return averageOfNumbers =  sum(list) / counter ;
//        
//        
//    }
//
//    public static double variance(ArrayList<Integer> list) {
//        
//        double varianceOfNumbers = 0;
//        double cal = 0;
//        
//        for (int numbers : list){
//            
//            cal +=  Math.pow((numbers - average(list)),2.0 );
//            
//            varianceOfNumbers = cal/(double)(list.size());
//        }
//        
//        
//        
//        return varianceOfNumbers;
//    }
//    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
