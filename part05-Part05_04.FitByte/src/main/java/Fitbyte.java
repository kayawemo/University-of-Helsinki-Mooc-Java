/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kayod
 */
public class Fitbyte {
    
    private int age;
    private int restingHeartRate;
    
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentage){
        double maxHeatRate = 206.3 - (0.711 * this.age);
        
        return (maxHeatRate - restingHeartRate) * (percentage) + restingHeartRate;
        
    }
    
}
