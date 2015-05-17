/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CGCore;

import CGCore.exceptions.CGIllegalStateException;
import CGCore.exceptions.TipoCartaAlredyExistException;
import CGCore.exceptions.TipoCartaNotRegisteredException;
import CGCore.interfaces.Carta;
import CGCore.interfaces.HasCallback;
import CGCore.interfaces.TipoCarta;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Manager che gestisce le carte.
 * @author Simo
 */
public class CardManager {
    
    private final Map<String, TipoCarta> map;
    private final CGCore core;
    private List<Carta> mazzoCompleto, mazzoGioco, mazzoDisabled;
    
    public CardManager(CGCore cg){
        this.map = new HashMap<>();
        this.core = cg;
        this.mazzoCompleto = new ArrayList<>();
        this.mazzoGioco = new ArrayList<>();
        this.mazzoDisabled = new ArrayList<>();
    }
    
    public void init(){
        if(core.getStatus()!=CGCore.status.LOAD){
            throw new CGIllegalStateException("Impossibile inizializzare i mazzi fuori dallo stato LOAD del core");
        }
        CallbackManager cbm = core.getCallbackManager();
        for (Carta c : mazzoCompleto){
            if (c.getTipo().isAbilitatoAlGioco()){
                mazzoGioco.add(c);
                if(c instanceof HasCallback){
                    HasCallback h = (HasCallback) c;
                    cbm.resgisterCallback(h.getCallback());
                }
            }
            else{
                mazzoDisabled.add(c);
            }
        }
    }
    
    public void addCard(Carta c, int n){
        if(core.getStatus()!=CGCore.status.INIT){
            throw new CGIllegalStateException("Impossibile registrare nuovi tipi fuori dallo stato INIT del core");
        }
        TipoCarta t = c.getTipo();
        if(!map.containsKey(t.getNome().toUpperCase())){
            throw new TipoCartaNotRegisteredException("Il tipo della carte che si sta cercando di aggiungere non risulta registrato");
        }
        for(int i=0; i<n; i++){
            mazzoCompleto.add(c);
        }
    }
    
    public void registerTipoCarta(TipoCarta t){
        if(core.getStatus()!=CGCore.status.INIT){
            throw new CGIllegalStateException("Impossibile registrare nuovi tipi fuori dallo stato INIT del core");
        }
        String key = t.getNome().toUpperCase();
        if(!map.containsKey(key)){
            map.put(key, t);
        }
        else{
            throw new TipoCartaAlredyExistException("Tipo " + key + " già registrato.");
        }
    }
    
    public TipoCarta getTipoCarta(String key){
        return map.get(key.toUpperCase());
    }
    
}
