import java.util.ArrayList;

public class NumberStatistics {
    
    private int amountOfNumbers ;
    private ArrayList<Integer> statistics ; 
    
    public NumberStatistics(){
        
        this.amountOfNumbers = 0;
        this.statistics = new ArrayList<Integer>();
    }
    
    public void addNumber(int number){
        
       this.statistics.add(number);
    }
    
    public int amountOfNumbers(){
        
        return this.statistics.size();
    }
    
    public int sum(){
        
        int sumOfNum = 0;
        
        if(!(this.statistics.isEmpty())){
            
            for (int i : this.statistics) {
                sumOfNum += i;
            }
            return sumOfNum;
        }
        return sumOfNum;
    }
    
    public double average(){
        
        double averageOfNumbers = 0;
        if (!(sum()== 0)){
        averageOfNumbers = (double)sum() / amountOfNumbers() ;
        }
        return averageOfNumbers;
    }
    
}
