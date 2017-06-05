/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raycs
 */
public class Counter {

    private int number;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.number = startingValue;
        this.check = check;
        
    }

    public Counter(int startingValue) {
//        this.number = startingValue;
//        this.check = false;
        this(startingValue,false);
    }

    public Counter(boolean check) {
//        this.number = 0;
//        this.check = true;
        this(0,true); // or this(0,check);
    }

    public Counter() {
//        this.number = 0;
//        this.check = false;
        this(0,false);
    }

    public int value() {
        return this.number;
    }

    public void increase() {
        increase(1);
    }

    public void decrease() {
        decrease(1);
    }

    public void increase(int increaseAmount) {
        if (!(increaseAmount < 0)) {
            this.number += increaseAmount;
        }
    }
 
    public void decrease(int decreaseAmount) { // this following lines of code is the alternative solution of this method.
//        if (decreaseAmount > 0) {
//            if (this.check && this.number >= decreaseAmount) {
//                this.number -= decreaseAmount;
//            } else if (this.check && this.number < decreaseAmount) {
//                this.number= 0;
//            } else if (this.check == false){
//                this.number -= decreaseAmount;
//                }
//            } 
         // this is the simplest solution for the decrease method
        if (decreaseAmount < 0){
            return;
        } this.number -= decreaseAmount;
            if (this.check && this.number<0){
                this.number = 0;
            }
        }
    }

