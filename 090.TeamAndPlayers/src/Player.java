/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raycs
 */
public class Player {

    private String nameOfPlayer;
    private int amountOIfGoals;

    // 1st constructor
    public Player(String name) {
        this.nameOfPlayer = name;

    }

    // 2nd Constructor
    public Player(String name, int amountOIfGoals) {
        this.nameOfPlayer = name;
        this.amountOIfGoals = amountOIfGoals;
    }

    //return the name of player
    public String getName() {
        return this.nameOfPlayer;
    }

    // This  method calculate the total number of goals of a single player
    public int goals() {

        return this.amountOIfGoals;
    }
    
    // return the info of a player
    public String toString() {
        return this.nameOfPlayer + ", goals " + this.goals();
    }
}
