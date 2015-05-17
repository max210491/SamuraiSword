/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.partita;

import CGCore.Game;
import CGCore.Phase;
import CGCore.Player;
import CGCore.interfaces.Carta;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Simo
 */
public class FasePesca extends Phase {

    @Override
    public void initPhase(Map<String, Object> param) {
        param.put("carteDaPescare", 2);
    }

    @Override
    public void executePhase(Map<String, Object> param, Game g) {

        //recupero il gestore delle callback in modo da poter lanciare eventi
        CGCore.CallbackManager cbm = g.getCallbackManager();

        //il giocatore attivo pesca 2 carte
        Player p = g.getActivePlayer();
        List<Carta> l = g.pesca((int) param.get("carteDaPescare"));
        if (l != null && l.size() < (int) param.get("carteDaPescare")) {
            //mescola e pesca le altre ecc.....
        }
        p.addCards(l);

        //infine lancio le callback per eseguire i codici relativi alle carte
        cbm.runCallback("pescaDueCarte", g);

    }

    @Override
    public void endPhase(Map<String, Object> param) {
    }
}
