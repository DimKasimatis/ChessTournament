/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.IGame;

/**
 *
 * @author Dim.Kasimatis
 */
public class Game extends Naming implements IGame {
    private Player[] players;

    public Game() {
        System.out.println("Game 1");
    }

    public Game(String name, Player[] players) {
        this.setName(name);
        this.start(players);
    }

    public void start(Player[] players) {
        System.out.println(this.getName());
        System.out.println("Player " + players[0] + " plays against Player " + players[1]);
        this.players = players;
        this.playersMove(players, new Clock(600));

        


    }
    
    public void playersMove(Player[] players, Clock c) {
        // Player X plays move m against Player Y
        // 15" * 4 = 1' * 10 = 10' == 600"
        // 600" = 40 cycles, 20 cycles
        c.getTimer();
        int otherPlayer = 1;
        for (int i = 0; i < 20; i++) {
            for (int k = 0; k < players.length; k++) {

                System.out.println("Player " + players[k] + " plays move " +
                                        players[k].moves(this, k) +
                                        " against Player " + players[otherPlayer]);
                if (otherPlayer == 1) {
                    otherPlayer = 0;
                } else {
                    otherPlayer = 1;
                }
                c.moveTime(c.getTimer());
                System.out.println("Time is: " + c.getTimer() + " seconds left");
            }
            
        }
    }
}
