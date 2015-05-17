/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CGCore;

import CGCore.interfaces.Callback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import CGCore.interfaces.Carta;

/**
 * Questa classe si occupa di tenere traccia tramite una map delle liste di
 * Callback registrate ad ogni evento.
 * @author Simo
 */
public class CallbackManager {
    
//    public static enum calType {FASE_RECUPERO, FASE_PESCA, FASE_GIOCA, FASE_SCARTA,
//        GIOCA_CARTA_ARMA, GIOCA_CARTA_AZIONE, GIOCA_CARTA_PROPRIETA,
//        CALCULATE_ATTACK_NUMBER, DAMAGE_DONE, DAMAGE_SUFFER,
//        CHOSE_PARRY, CHOSE_TARGET, CHOSE_ACTION, END_TURNO};
    
    private Map<String, List<Callback>> map;
    
    public CallbackManager(){
        this.map = new HashMap<>();
    }
    
    public void resgisterCallback(Callback c){
        List<Callback> list = map.get(c.getCalbackName());
        if (list==null){
            list = new ArrayList<>();
            map.put(c.getCalbackName(), list);
        }
        list.add(c);
    }
    
    public boolean runCallback(String name, Game game){
        for (Callback c : map.get(name)){
            if(c.isValidCall(game) && !c.execute(game)){
                LOG.severe("Errore nell'esecuzione di una callback di tipo: " + name);
                return false;
            }
        }
        return true;
    }
    
    private static final Logger LOG = Logger.getLogger(CallbackManager.class.getName());
}
