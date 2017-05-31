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
public class Super6 extends Lotto_Spielen {
    
    private ArrayList superSixNumbers ;
    private Random randomNumbers;
    
    public Super6(){
        this.superSixNumbers = new ArrayList<Integer>();
        this.randomNumbers = new Random();
    }
    
    public boolean containSameNumber(int number){
            return this.superSixNumbers.contains(number);
    }
    
    public ArrayList<Integer> drawSuper6(){
    
        int number ;
        while (this.superSixNumbers.size()< 7){
            number = this.randomNumbers.nextInt(9);
            if (!containSameNumber(number)) this.superSixNumbers.add(number);
        }
       return this.superSixNumbers; 
    }
}
