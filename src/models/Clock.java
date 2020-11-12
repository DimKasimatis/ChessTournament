/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Dim.Kasimatis
 */
public class Clock extends Naming {
    private int timer;
    
    public Clock(int timer) {
        this.setTimer(timer);
        System.out.println("Time limit is: " + timer/60 +" minutes");
    }
    
    public void setTimer(int timer) {
        this.timer = timer;
    }
    
    public int getTimer() {
        return timer;
    }
    
    public void moveTime(int timer) {
        this.timer = timer - 15;
    }
}
