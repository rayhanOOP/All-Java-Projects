
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
public class Team {

    private String name;
    private ArrayList<Player> players = new ArrayList<Player>();
    private int maxNumPlayers;
    
    
    public Team(String name) { // constructor
        this.name = name;
        this.maxNumPlayers = 16;
        
    }

    // return the name of a team
    public String getName() {
        return this.name;
    }

    // This following method add a player to the team
    public void addPlayer(Player player) {
        if (players.size()< this.maxNumPlayers)
        players.add(player);
    }

    //Print info of all the players under the condition of max number of players.
    public void printPlayers() {
       
        for (Player p: players){
            System.out.println(p);}
        }
  
    
    // max number of player condition setting by user
    public void setMaxSize(int maxSize){
        maxNumPlayers = maxSize;
    }
    
    // number of total players
    public int size(){
    return players.size();
    }
     // This  method calculate the total number of goals of all players
    public int goals(){
       int totalGoals = 0 ;
        for (Player p: players){
            totalGoals += p.goals();  
        }
        
        return totalGoals;
    }
}
