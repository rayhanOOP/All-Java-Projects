
public class EvenNumbers {

    public static void main(String[] args) {
       int number = 2;
       
            while (number <= 100 )// Write your program here
            {
            int evenNumbersCalculator = number % 2;
            if (evenNumbersCalculator == 0){
                System.out.println(number);
            }
            number++;
        }
            
    }
}
