/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kayod
 */
public class Container {

    private int number;

    public Container() {
    }

    public int contains() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.number += amount;
            if (this.number > 100) {
                this.number = 100;
            }
        }
    }

    public void remove(int amount) {
//        if (amount > 0) {
//            this.number -= amount;
//            if (this.number < 0) {
//                this.number = 0;
//            }
//        }
        if (this.number > amount) {
            this.number -= amount;

        }else if (this.number <= amount){
            this.number = 0;
        }
    }

    public String toString() {
        return this.number + "/100";
    }

}
