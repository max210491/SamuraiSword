/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.partita.fasi;

import CGCore.Game;
import CGCore.Phase;
import CGCore.Player;
import java.util.Map;
import samuraysword.partita.Giocatore;

/**
 *
 * @author User
 */
public class FaseRecupero extends Phase {

    @Override
    public void initPhase(Map<String, Object> param) {}

    @Override
    public void executePhase(Map<String, Object> param, Game g) {
        //recupera tutti i punti resistenza se non ne hai nessuno
        for(Player p : g.getPlayers()){
            Giocatore pl = (Giocatore)p;
            if(!pl.isAlive()){
                pl.setResistenza(pl.getPersonaggio().getResistenza());
            }
        }
        
    }

    @Override
    public void endPhase(Map<String, Object> param) {}
    
}
