import java.util.ArrayList;
import java.util.*;
public class TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
        // write code here
      
        
        Integer i = Collections.max(list);

        
        return i;  
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(102);
        lista.add(80);
        lista.add(990);
        lista.add(98);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}