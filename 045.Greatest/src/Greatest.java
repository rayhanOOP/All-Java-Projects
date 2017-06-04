
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int greatestNumber = 0;
        if (number2 > number1 && number2 > number3){
            greatestNumber = number2;
               return greatestNumber;
        }
        else if (number1 > number2 && number1 > number3) {
            greatestNumber = number1;
               return greatestNumber;
        }
        else 
            return number3;
    }

    public static void main(String[] args) {
        int result = greatest(2, 0, 3);
        System.out.println("Greatest: " + result);
    }
}