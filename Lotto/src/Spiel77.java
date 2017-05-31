import java.util.Random;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raycs
 */
public class Spiel77 extends Lotto_Spielen {
    
    private ArrayList<Integer> numbers;
    private Random randomNumbers ;
    
    public Spiel77(){    
        this.numbers = new ArrayList<Integer>();
        this.randomNumbers = new Random();
       // drawSpiel77();
    }
    
    public ArrayList<Integer> drawSpiel77(){
        int number ;
        
        while(this.numbers.size() < 7){
            number = this.randomNumbers.nextInt(9);
            if (!containSameNumber(number))this.numbers.add(number);
        }
        return this.numbers;
    }
    
    
    public boolean containSameNumber(int number){
       return this.numbers.contains(number);
    }
}
