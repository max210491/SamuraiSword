/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.partita;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import samuraysword.Carta;
import samuraysword.Partita;
import samuraysword.callback.Callback;

/**
 * Questa classe si occupa di tenere traccia tramite una map delle liste di
 * Callback registrate ad ogni evento.
 * @author Simo
 */
public class CallbackManager {
    
    public static enum calType {FASE_RECUPERO, FASE_PESCA, FASE_GIOCA, FASE_SCARTA,
        GIOCA_CARTA_ARMA, GIOCA_CARTA_AZIONE, GIOCA_CARTA_PROPRIETA,
        CALCULATE_ATTACK_NUMBER, DAMAGE_DONE, DAMAGE_SUFFER,
        CHOSE_PARRY, CHOSE_TARGET, CHOSE_ACTION, END_TURNO};
    
    private Map<calType, List<Callback>> map;
    
    public CallbackManager(){
        this.map = new HashMap<>();
    }
    
    public void resgisterCallback(calType t, Callback c){
        List<Callback> list = map.get(t);
        if (list==null){
            list = new ArrayList<>();
            map.put(t, list);
        }
        list.add(c);
    }
    
    public boolean runCallback(calType t, Partita p){
        for (Callback c : map.get(t)){
            if(!c.execute(p)){
                LOG.severe("Errore nell'esecuzione di una callback di tipo: " + t.toString());
                return false;
            }
        }
        return true;
    }
    
    private static final Logger LOG = Logger.getLogger(CallbackManager.class.getName());
}
