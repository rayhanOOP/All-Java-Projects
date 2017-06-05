/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raycs
 */
public class LyyraCard {

    private double balance;
    //private String name;

    public LyyraCard(double startBalance) {
        this.balance = startBalance;
        //this.name = ownerName;
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        if (this.balance >= 2.5) {
            this.balance -= 2.5;
        }
    }

    public void payGourmet() {
        if (this.balance >= 4) {
            this.balance -= 4;
        }
    }

    public void loadMoney(double amount) {
        double limitBalance = 150;
        
        if (this.balance + amount  >= limitBalance)
        {
            this.balance = limitBalance ;
        }
        else if (amount < 0){
            
            amount = 0;
        }
        else
                this.balance += amount;
                
    }
    

}
