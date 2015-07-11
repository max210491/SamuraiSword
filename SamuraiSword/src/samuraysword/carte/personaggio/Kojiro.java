/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.carte.personaggio;

import CGCore.Game;
import CGCore.interfaces.Callback;
import CGCore.interfaces.TipoCarta;
import samuraysword.Partita;
import samuraysword.carte.interfaces.Personaggio;
//import samuraysword.partita.ComplexAction;

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

    @Override
    public Callback getCallback() {
        return new Callback("attacco") {
            @Override
            public boolean execute(Game game) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
            @Override
            public boolean isValidCall(Game game) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }

    
    /**
     * La call prende dalla partita l'azione corrente, e modifica la distanza
     * dell'arma selezionata, per questo attacco(quindi il valore in partita e
     * non quello della carta che altrimenti resterebbe variato)
     * @param p 
     */
//    @Override
//    public void runCallback(Partita p) {
//        //Per fare un esempio
//        //Attacco a = p.getAttacco();
//        //a.setDistance(Intger.MAX_VALUE);
//        
//    }
//
//    /**
//     * L'abiltà è collegata al tipo attacco (sto ancora ipotizzando).
//     * Viene eseguita durante un attacco (del giocatore) e modifica le
//     * caratteristiche dell'attacco (recuperato dalla partita passata).
//     * @return il tipo "ATTACCO"
//     */
//    @Override
//    public ComplexAction.tipoAzione getTipoCall() {
//        //per fare un esempio
//        return ComplexAction.tipoAzione.ATTACCO;
//    }
    
    
}
