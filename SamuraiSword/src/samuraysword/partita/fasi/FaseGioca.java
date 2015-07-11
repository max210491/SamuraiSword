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
public class FaseGioca  extends Phase{

    @Override
    public void initPhase(Map<String, Object> param) {}

    @Override
    public void executePhase(Map<String, Object> param, Game g) {
        Player p = g.getActivePlayer();
        boolean go = true;
        while(go){
            //chiedi a p cosa vuole fare
            
            //attendi una risposta
            
            //esegui
            
            //o eventualemnte termina il turno
            go = false;
        }
    }

    @Override
    public void endPhase(Map<String, Object> param) {}
    
}
