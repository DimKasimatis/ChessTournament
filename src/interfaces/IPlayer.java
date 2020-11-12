/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import models.Game;
import models.Player;
/**
 *
 * @author Dim.Kasimatis
 */
public interface IPlayer {
    String moves(Game game, int playerNumber);
}
