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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Spiel77 lottery = new Spiel77();
        Super6 lotterySuperSix = new Super6();
        
        System.out.println(lottery.drawSpiel77());
        System.out.println(lotterySuperSix.drawSuper6());
    }
    
}
