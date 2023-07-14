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

    private int content;

    public Container() {
        this.content = 0;
    }

    public int contains() {
        return this.content;
    }

    public void setNumber(int number) {
        this.content = number;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.content += amount;
            if (this.content > 100) {
                this.content = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            if (amount <= this.content) {
                this.content -= amount;
            }
        } else if (amount > this.content) {
            this.content = 0;
        }
    }

    public String toString() {
        return this.content + "/100";
    }

}
