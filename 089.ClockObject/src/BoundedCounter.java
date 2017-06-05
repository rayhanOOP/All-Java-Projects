
public class BoundedCounter {
    private int value;
    private int upperBound;

    public BoundedCounter(int upperBound) {

        this.value = 0;
        this.upperBound = upperBound;
    }

    public void next() {
//        
        if (this.value >= this.upperBound)
        {
            this.value = 0;
        }
        else this.value++ ; 
        
       }
        
    public String toString(){
        if (this.value >= 10){
        return "" + this.value ;
        } 
        else return "0" + this.value ;
    }

    public void setValue(int param){
        
        if(param >= 0 && param <= this.upperBound)
              this.value = param;
    }
    
    public int getValue(){
        return this.value;
    }
 
}
