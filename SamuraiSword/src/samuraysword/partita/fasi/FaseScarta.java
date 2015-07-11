/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.partita.fasi;

import CGCore.Game;
import CGCore.Phase;
import CGCore.Player;
import java.util.Map;

/**
 *
 * @author User
 */
public class FaseScarta extends Phase{

    @Override
    public void initPhase(Map<String, Object> param) {}

    @Override
    public void executePhase(Map<String, Object> param, Game g) {
        //se alla fine del tuo turno (turno di chi gioca) hai più di 7 carte scarta quelle in eccesso
        Player p = g.getActivePlayer();
        while(p.getCards().size()>7){
            //richiedi a quel giocatore di scartare una carta e attendi una rispostaprima di proseguire
            //per evitare loop per ora return
            return;
        }
    }

    @Override
    public void endPhase(Map<String, Object> param) {}
    
}
