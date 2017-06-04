import java.util.Random;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raycs
 */
public class DieToss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        


    //Scanner scan = new Scanner( System.in );
    Random rand = new Random( );
    
    while ( true )
    {
      System.out.println("You toss a " + (rand.nextInt(6)+1) );
      //String line = scan.nextLine(); // using this line of code (+ Scanner function) end the programm by pressing "Enter"
       break; // using break end the programm after every single toss.
    }
  } 
}
   