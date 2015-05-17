/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.carte.personaggio;

import CGCore.Game;
import CGCore.interfaces.Callback;
import CGCore.interfaces.TipoCarta;
import samuraysword.carte.Personaggio;
//import samuraysword.partita.ComplexAction;

/**
 *
 * @author Mirko
 */
public class Chiyome extends Personaggio {
        String personaggio;
        public Chiyome(TipoCarta t){
            super(t, 4, "Può essere ferita solo da armi");
        }

    @Override
    public String getName() {
        return "Chiyome";
    }

    @Override
    public Callback getCallback() {
        return new Callback(("selectTargetAzione")) {
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
     * La call verifica che l'azione sia di danneggiamento e in quel caso
     * rimuove se stessa dal target
     * @param p 
     */
//    @Override
//    public void runCallback(Partita p) {
//        //Azione a = p.getAzione();
//        // if(a.danno) a.removeFromTargetList(this);
//    }
//
//    /**
//     * La proprietà entra in gioco quando si deve selezionare il bersazio di
//     * un carta azione
//     * @return 
//     */
//    @Override
//    public ComplexAction.tipoAzione getTipoCall() {
//        return ComplexAction.tipoAzione.AZIONE;
//    }
}
