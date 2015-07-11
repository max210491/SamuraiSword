/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.carte.azioni;

import CGCore.Game;
import CGCore.Player;
import CGCore.interfaces.Callback;
import java.util.ArrayList;
import java.util.List;
import samuraysword.SamuraySword;
import samuraysword.carte.Azione;

/**
 *
 * @author User
 */
public class CerimoniaDelTe extends Azione{

    @Override
    public String getDescription() {
        return "pesca 3 carte dal mazzo. Tutti gli altri giocatori poi pescano una carta dal mazzo.";
    }

    @Override
    public String getName() {
        return "Cerimonia del tè";
    }

    @Override
    public Callback getCallback() {
        return new Callback(SamuraySword.executeActionCard) {
            @Override
            public boolean execute(Game game) {
                //copio la lista di player
                List<Player> l = game.getInactivePlayers();
                Player p = game.getActivePlayer();
                p.addCards(game.pesca(3));
                for(Player p2 : l){
                    p2.addCards(game.pesca(1));
                }
                return true;
            }
            
            @Override
            public boolean isValidCall(Game game) {
                //non ci sono condizioni
                return true;
            }
        };
    }
    
}
