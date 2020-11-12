/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import models.Clock;
import models.Player;

/**
 *
 * @author Dim.Kasimatis
 */
public interface IGame {
    /*
        - uses the two players
        - each player moves one after the other
    */
    public void start(Player[] players);
    
    public void playersMove(Player[] players, Clock c);
    
//    public static String dummy() {
//        return("asdasdsad");
//    }
}
