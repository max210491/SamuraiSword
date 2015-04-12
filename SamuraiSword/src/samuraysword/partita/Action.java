/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.partita;

import samuraysword.Carta;
import samuraysword.Partita;
import samuraysword.callback.Callback;

/**
 * Classe che rappresenta le azioni effettuate da un giocatore durante la sua
 * fase di gioco.
 * @author User
 */
public class Action {
    
    public static enum actType {GIOCA_ARMA, GIOCA_AZIONE, GIOCA_PROPRIETA, ALTRO};
    
    private final String descrizione;
    private final actType tipo;
    private Partita p;
    private Callback c;
    
    public Action(Partita p, Callback c, String descrizione){
        this.p = p;
        this.c = c;
        this.descrizione = descrizione;
        this.tipo = actType.ALTRO;
    }
    
    public Action(Partita p, Carta c){
        this.p = p;
        this.descrizione = "Gioca " + c.getName();
        switch (c.getTipo()){
            case ARMA:
                this.tipo = actType.GIOCA_ARMA;
                break;
            case SUPPORTO:
                this.tipo = actType.GIOCA_PROPRIETA;
                break;
            case AZIONE:
                this.tipo = actType.GIOCA_AZIONE;
                break;
            default:
                this.tipo = actType.ALTRO;
        }
    }
    
    public boolean runAction(){
        switch (tipo){
            case GIOCA_ARMA:
                p.startAttack();
                break;
            case GIOCA_AZIONE:
                p.startAction();
                break;
            case GIOCA_PROPRIETA:
                p.startSupport();
                break;
            default:
                if (c==null || !c.execute(p))
                    return false;
        }
        return true;
    }
}
