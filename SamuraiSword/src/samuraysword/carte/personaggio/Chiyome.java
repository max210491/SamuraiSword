/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.carte.personaggio;

import java.util.ArrayList;
import samuraysword.Carta;
import samuraysword.partita.Giocatore;
import samuraysword.Partita;
import samuraysword.carte.Personaggio;
import samuraysword.carte.Ruolo;
import samuraysword.partita.ComplexAction;

/**
 *
 * @author Mirko
 */
public class Chiyome extends Personaggio {
        String personaggio;
        public Chiyome(){
            super(4, "Può essere ferita solo da armi");
        }

    @Override
    public String getName() {
        return "Chiyome";
    }

    /**
     * La call verifica che l'azione sia di danneggiamento e in quel caso
     * rimuove se stessa dal target
     * @param p 
     */
    @Override
    public void runCallback(Partita p) {
        //Azione a = p.getAzione();
        // if(a.danno) a.removeFromTargetList(this);
    }

    /**
     * La proprietà entra in gioco quando si deve selezionare il bersazio di
     * un carta azione
     * @return 
     */
    @Override
    public ComplexAction.tipoAzione getTipoCall() {
        return ComplexAction.tipoAzione.AZIONE;
    }
}
