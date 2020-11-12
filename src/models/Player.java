/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.IPlayer;

/**
 *
 * @author Dim.Kasimatis
 */
public class Player extends Naming implements IPlayer {
    private int[] playerCounter = new int[] {0, 0, 0, 0};
    
    public Player() {
        
    }
    
    public Player(String name) {
        this.setName(name);
        System.out.println(name);
    } 
    
    /*
        In this method we need to figure out 
        for the specific game which move the player does
    */
    public String moves(Game game, int playerNumber) {
        String result = "";
        
        playerCounter[playerNumber]++;
        if (playerCounter[0] > 20) {
            playerCounter[0] = 1;
        }
        result = Integer.toString(playerCounter[playerNumber]);
//        result = counter + "";
//        result = String.valueOf(counter);
        return(result);
    }
    
}
