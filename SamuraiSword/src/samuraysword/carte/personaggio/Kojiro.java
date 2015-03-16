/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.carte.personaggio;

import samuraysword.Partita;
import samuraysword.carte.Personaggio;
import samuraysword.partita.ComplexAction;

/**
 *
 * @author User
 */
public class Kojiro extends Personaggio{
    
    public Kojiro(){
        super(5, "Le tue armi possono attaccare a qualsiasi difficoltà");
    }

    @Override
    public String getName() {
        return "Kojiro";
    }

    
    /**
     * La call prende dalla partita l'azione corrente, e modifica la distanza
     * dell'arma selezionata, per questo attacco(quindi il valore in partita e
     * non quello della carta che altrimenti resterebbe variato)
     * @param p 
     */
    @Override
    public void runCallback(Partita p) {
        //Per fare un esempio
        //Attacco a = p.getAttacco();
        //a.setDistance(Intger.MAX_VALUE);
        
    }

    /**
     * L'abiltà è collegata al tipo attacco (sto ancora ipotizzando).
     * Viene eseguita durante un attacco (del giocatore) e modifica le
     * caratteristiche dell'attacco (recuperato dalla partita passata).
     * @return il tipo "ATTACCO"
     */
    @Override
    public ComplexAction.tipoAzione getTipoCall() {
        //per fare un esempio
        return ComplexAction.tipoAzione.ATTACCO;
    }
    
    
}
